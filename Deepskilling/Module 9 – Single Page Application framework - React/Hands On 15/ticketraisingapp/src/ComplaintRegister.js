import React, {useState} from 'react';
function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');
  const [errors, setErrors] = useState({});

  const generateReferenceNumber = () => {
    const timestamp = Date.now();
    const randomNum = Math.floor(Math.random() * 1000);
    const prefix = 'CMP';
    return `${prefix}-${timestamp}-${randomNum}`;
  };

  const validateForm = () => {
    const newErrors = {};
    
    if (!employeeName.trim()) {
      newErrors.employeeName = 'Employee name is required';
    }
    
    if (!complaint.trim()) {
      newErrors.complaint = 'Complaint description is required';
    }
    
    return newErrors;
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    
    const validationErrors = validateForm();
    if (Object.keys(validationErrors).length > 0) {
      setErrors(validationErrors);
      return;  
    }
    
    setErrors({});
    
  
    const referenceNumber = generateReferenceNumber();
    
    alert(
      `Complaint Registered Successfully!\n\n` +
      `Employee: ${employeeName}\n` +
      `Reference Number: ${referenceNumber}\n\n` +
      `Please save this reference number for future follow-ups.`
    );
    
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div className="complaint-form" style={{textAlign:"center"}}>
        <div style={{color:"red"}}>
            <h2>Register Your Complaints here!!!</h2>
        </div>
      
      
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="employeeName">Employee Name:</label>
          <input
            type="text"
            id="employeeName"
            value={employeeName}
            onChange={(e) => {
              setEmployeeName(e.target.value);
              if (errors.employeeName) {
                setErrors({ ...errors, employeeName: '' });
              }
            }}
            placeholder="Enter your full name"
          />
          {errors.employeeName && (
            <span style={{ color: 'red' }}>{errors.employeeName}</span>
          )}
        </div>

        <div>
          <label htmlFor="complaint">Complaint:</label>
          <textarea
            id="complaint"
            rows="5"
            value={complaint}
            onChange={(e) => {
              setComplaint(e.target.value);

              if (errors.complaint) {
                setErrors({ ...errors, complaint: '' });
              }
            }}
            placeholder="Describe your complaint in detail"
          />
          {errors.complaint && (
            <span style={{ color: 'red' }}>{errors.complaint}</span>
          )}
        </div>

        <button type="submit">
          Submit
        </button>
      </form>
    </div>
  );
}
export default ComplaintRegister;