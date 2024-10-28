import React from 'react'
import { useState } from 'react';
import { useEffect } from 'react'
import { fetchEmployees } from '../../api/empapi';
import '../index.css';
import Footer from './Footer';
function EmployeeList() {
    const [employees,setEmployees]=useState([]);
    const [error,setError]=useState(null);

    const getEmployees = async()=> {
        try{

        const employees= await fetchEmployees();
        setEmployees(employees);
        console.log(employees);
        console.log(employees[employees.length-1].id+1);
        }catch(err){
            setError(err.message);
        }

    };

    useEffect(()=>{
        getEmployees();
    },[]);
    return (
        <>
        <h1 className='text-[2rem] font-bold text-center text-red-500 mb-2'>WorkForce Heroes</h1>
        {error && <p>Error:{error}</p>}
    <div className='w-[90%] m-auto h-[100vh] bg-red-600 clip-path-cross-cut absolute top-[70%] left-[50%] transform -translate-x-1/2 -translate-y-1/2'>
        </div>
    <table className="relative m-auto w-[80%] bg-[#1111] border border-gray-300 font-bold">
                <thead>
                    <tr className="bg-[black] text-[#fff]">
                        <th className="px-4 py-2 border">ID</th>
                        <th className="px-4 py-2 border">Name</th>
                        <th className="px-4 py-2 border">Job</th>
                        <th className="px-4 py-2 border">Salary</th>
                        <th className="px-4 py-2 border">Department No.</th>
                    </tr>
                </thead>
            <tbody>
                {employees && 
                    employees.map((employee) => (
                        <tr key={employee.id} className="hover:bg-gray-900 text-[#fff]">
                            <td className="px-4 py-2 border">{employee.id}</td>
                            <td className="px-4 py-2 border">{employee.name}</td>
                            <td className="px-4 py-2 border">{employee.job}</td>
                            <td className="px-4 py-2 border">{employee.sal}</td>
                            <td className="px-4 py-2 border">{employee.deptNo}</td>
                        </tr>
                    ))}
            </tbody>
        </table>
    </>
  )
}

export default EmployeeList
