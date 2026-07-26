import React, {useState} from 'react';

function Register(){
    const [formData,setFormData]=useState({
        name:'',email:'',password:''
    });

    const [errors,setErrors]=useState({});

    const handleChange=(e)=>{
        const {name,value}=e.target;
        
        setFormData({
            ...formData,[name]:value
        });
    };

    const handleSubmit=(e)=>{
        e.preventDefault();
        let validationErrors={};

        //Rule 1:Name must be at least 5 character
        if(formData.name.length<5){
            validationErrors.name="Full Name must be 5 characters long!";
        }

        //Rule 2: Email must contain '@' and '.'
        if(!formData.email.includes('@')||!formData.email.includes('.')){
            validationErrors.email="Email is not valid!";
        }

        //Rule 3: Passowrd must be at least 8 characters
        if(formData.password.length<8){
            validationErrors.password="Password must be 8 characters long!";
        }

        //check if any error found
        if(Object.keys(validationErrors).length>0){
            setErrors(validationErrors);
        }
        else{
            setErrors({});
            alert(`Registration Successfull!`);
            console.log("Submitted Data",formData);
        }
    }

    return(
        <div style={{maxWidth:`400px`,margin:`50px auto`,fontFamily:`sans-serif`}}>
            <div style={{color:'red'}}>
                <h2>Register Here!!!</h2>
            </div>

            <form onSubmit={handleSubmit}>
                {/* Name Input*/}
                <div style={{marginBottom:`15px`}}>
                    <label style={{display:`block`,marginBottom:`5px`}}>Name:</label>
                    <input
                    type='text'
                    name="name"
                    value={formData.name}
                    onChange={handleChange}
                    style={{width:`100%`,padding:`8px`}}
                    />
                    {errors.name && <span style={{color:`red`,fontSize:`13px`}}>{errors.name}</span>}
                </div>

                {/* Email Input*/}
                <div style={{marginBottom:`15px`}}>
                    <label style={{display:`block`,marginBottom:`5px`}}>Email:</label>
                    <input 
                    type="text"
                    name="email"
                    value={formData.email}
                    onChange={handleChange}
                    style={{width:`100%`,padding:`8px`}}
                    />
                    {errors.email && <span style={{color:`red`,fontSize:`13px`}}>{errors.email}</span>}
                </div>

                {/* Password Input*/}
                <div style={{marginBottom:`15px`}}>
                    <label style={{display:`block`,marginBottom:`5px`}}>Password:</label>
                    <input 
                    type="password"
                    name="password"
                    value={formData.password}
                    onChange={handleChange}
                    style={{width:`100%`,padding:`8px`}}
                    />
                    {errors.password && <span style={{color:`red`,fontSize:`13px`}}>{errors.password}</span>}
                </div>

                <button type="submit"style={{padding:`10px 15px`,cursor:`pointer`}}>
                    Submit
                </button>
            </form>
        </div>
    );
}
export default Register;