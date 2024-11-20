import axios from "axios";
const API_URL='http://localhost:8080/api/employees';


export const fetchGetEmployeesByDeptId=async(deptId)=>{
    try{
        // let response=await axios.get(`${API_URL}/${deptId}`);
        let response=await axios.get(`${API_URL}/${deptId}`);
        return response.data;
    }catch(err){
        throw new Error(err.message)
    }
}