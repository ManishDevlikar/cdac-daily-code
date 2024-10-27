import axios from "axios";
const API_URL='http://localhost:5243/';


export const fetchEmployees=async ()=>{
    try{
        const response=await axios.get(`${API_URL}heroes`);
        return response.data;
    }catch(err){
        throw new Error(err.response?err.response.data:err.message);
    }
}


export const addEmployee=(employee)=>{
    const params = {
        deptId: employee.deptId,
        empno: employee.empno,
        name: employee.name,
        job: employee.job,
        mgr: employee.mgr,
        date: employee.date, // Ensure this is formatted as a string if necessary
        salary: employee.salary,
        comm: employee.comm
    };

    return axios.post(`${API_URL}heroes`,null,{params});
}
