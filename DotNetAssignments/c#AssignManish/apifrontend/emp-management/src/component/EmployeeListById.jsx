import React from 'react'

function EmployeeListById() {
    const [deptId,setDeptId]= useState(0);
    const [employees,setEmployees]=useState([]);

    useEffect(()=>{
        const fetchData=async()=>{
            try{
                const response=await fetchGetEmployeesByDeptId(deptId);
                const data=await response.json();
                setEmployees(data);
            }catch(err){
                console.error(err);
            }
        }
        fetchData();
    },[])
  return (
    <div>
        <input type="number" />

    </div>
  )
}

export default EmployeeListById
