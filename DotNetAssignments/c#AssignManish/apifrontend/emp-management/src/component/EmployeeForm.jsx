import React, { useState } from 'react'
import { addEmployee } from '../../api/empapi';

function EmployeeForm() {
    const [formData,setFormData] = useState({
        deptId: "",
        empno: "",
        name: "",
        job: "",
        mgr: "",
        date: "",
        salary: "",
        comm: ""
    })
   
    const[error,setError]=useState(null);
    const[success,setSuccess]=useState(false);

    const handleChange=(e)=>{
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit= async (e)=>{
        e.preventDefault();
        try {
            const data={
                deptId:Number(formData.deptId),
                empno:Number(formData.empno),
                name:formData.name,
                job:formData.job,
                mgr:Number(formData.mgr),
                date:new Date(formData.date),
                salary:Number(formData.salary),
                comm:Number(formData.comm)
            };
            await addEmployee(data);
            setSuccess(true);
            setError(null);

        }catch(err){
            setError(err.message);
            setSuccess(false);
        }
    }




  return (
    <>
        <h2>Add a Workforce Hero</h2>
        {error && <p className='text-white'>Error : {error}</p>}
        {success && <p className='text-white'>Employee Added Successfully !</p>}

        <form onSubmit={handleSubmit} className='flex flex-col gap-5'>
        <input
          type="number"
          name="deptId"
          placeholder="Department ID"
          value={formData.deptId}
          onChange={handleChange}
          required
        />
        <input
          type="number"
          name="empno"
          placeholder="Employee No"
          value={formData.empno}
          onChange={handleChange}
          required
        />
        <input
          type="text"
          name="name"
          placeholder="Name"
          value={formData.name}
          onChange={handleChange}
          required
        />
        <input
          type="text"
          name="job"
          placeholder="Job"
          value={formData.job}
          onChange={handleChange}
          required
        />
        <input
          type="number"
          name="mgr"
          placeholder="Manager ID"
          value={formData.mgr}
          onChange={handleChange}
        />
        <input
          type="date"
          name="date"
          value={formData.date}
          onChange={handleChange}
          required
        />
        <input
          type="number"
          name="salary"
          placeholder="Salary"
          value={formData.salary}
          onChange={handleChange}
          required
        />
        <input
          type="number"
          name="comm"
          placeholder="Commission"
          value={formData.comm}
          onChange={handleChange}
          required
        />
        <button type="submit">Add Hero</button>
      </form>
    </>
  )
}

export default EmployeeForm
