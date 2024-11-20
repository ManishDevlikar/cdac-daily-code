import { useState } from "react"
import { fetchGetEmployeesByDeptId } from "./apis/api";

function App() {

  const [depId,setDeptId]=useState(0);
  const [employees,setEmployees]=useState([])

  const fetchEmployees = async()=>{
    if(depId>0){
      try{
        const response = await fetchGetEmployeesByDeptId(depId);
        setEmployees(response);
      }catch(err){
        console.log(err);
      }
    }else{
      console.log("enter valid deptNo");  
    }
  }

  const handleChange=(e)=>{
    let deptno;
    try{
      deptno = Number(e.target.value);
    }catch(err){
      console.log(err);
    }
    setDeptId(deptno);
  }

  return (
    <>
      <div className='w-[50%] flex align-middle justify-center m-auto flex-col mt-5'>
        <input type="number"
        className="self-center w-[30%] p-3"
         value={depId==0?"":depId}
         onChange={handleChange}
         placeholder='Enter Department Id'/>

            <button
            onClick={fetchEmployees}
            className="mt-5  px-4 py-1 text-white self-center bg-red-600 w-[10rem] rounded-sm text-center hover:bg-red-800"
            >
            Fetch Employees
            </button>
    </div>

    {employees.length>0 &&
<h3 className='text-[1.7rem] mt-10 font-bold text-center text-red-600 mb-2'>WorkForce Heroes In Department {depId!=0?depId:""}</h3>
}
{employees.length>0 &&
    <table className="relative m-auto w-[80%] bg-[#1111] border border-gray-300 font-bold">
                <thead>
                    <tr className="bg-[black] text-[#fff]">
                        <th className="px-4 py-2 border">ID</th>
                        <th className="px-4 py-2 border">Name</th>
                        <th className="px-4 py-2 border">Job</th>
                        <th className="px-4 py-2 border">mgr</th>
                        <th className="px-4 py-2 border">Salary</th>
                        <th className="px-4 py-2 border">comm</th>
                        <th className="px-4 py-2 border">Department No.</th>
                        <th className="px-4 py-2 border">hiredate</th>
                    </tr>
                </thead>
            <tbody>
            {employees && 
                    employees.map((employee) => (
                        <tr key={employee.id} className="bg-gray-700 hover:bg-red-600 text-[#fff]">
                            <td className="px-4 py-2 border">{employee.empno}</td>
                            <td className="px-4 py-2 border">{employee.ename}</td>
                            <td className="px-4 py-2 border">{employee.job}</td>
                            <td className="px-4 py-2 border">{employee.mgr}</td>
                            <td className="px-4 py-2 border">{employee.sal}</td>
                            <td className="px-4 py-2 border">{employee.comm}</td>
                            <td className="px-4 py-2 border">{employee.deptNo}</td>
                            <td className="px-4 py-2 border">{employee.hiredate}</td>
                        </tr>
                    ))}
            </tbody>
        </table>
    }
    </>
  )
}

export default App
