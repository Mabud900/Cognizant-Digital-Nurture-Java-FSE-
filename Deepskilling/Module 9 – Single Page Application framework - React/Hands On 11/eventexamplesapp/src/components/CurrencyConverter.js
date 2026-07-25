import React, {Component} from 'react';

class CurrencyConverter extends Component{
    constructor(props){
        super(props);
        this.state={
            rupess:"",
            euro:""
        };
    }

    handleChange=(e)=>{
        this.setState({
            rupees:e.target.value
        });
    };

    handleSubmit=(e)=>{
        e.preventDefault();
        const rate=0.011;
        const result=(this.state.rupees*rate).toFixed(2);
        this.setState({
            euro:result,
        });
    };

    render(){
        return(
            <div style={{textAlign:"center",marginTop:"50px"}}>
                <h2>Currency Converter</h2>

                <form onSubmit={this.handleSubmit}>
                    <input 
                    type="number"
                    value={this.state.rupees}
                    onChange={this.handleChange}
                    placeHolder="Enter Rupees"
                    />

                    <button type="submit" style={{marginLeft:"10px"}}>Convert</button>
                </form>
                <h3>euro:{this.state.euro}</h3>
            </div>
        );
    }
}
export default CurrencyConverter;