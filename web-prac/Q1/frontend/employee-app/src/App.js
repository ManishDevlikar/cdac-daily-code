import React, { useState, useEffect } from 'react';

const EmployeePage = () => {
  const [employees, setEmployees] = useState([]);
  const [deptNo, setDeptNo] = useState('');

  useEffect(() => {
    fetchEmployees();
  }, []);

  const fetchEmployees = async (departmentNumber = '') => {
    try {
      const response = await fetch(
        departmentNumber 
          ? `http://localhost:3001/api/employees?deptNo=${departmentNumber}` 
          : 'http://localhost:3001/api/employees'
      );
      const data = await response.json();
      setEmployees(data);
    } catch (error) {
      console.error('Error fetching employees:', error);
    }
  };

 

  const handleSearch = () => {
    fetchEmployees(deptNo);
  };

  return (
    <div style={{ padding: '20px'}}>
      <h1 style={{ fontSize: '24px', fontWeight: 'bold', marginBottom: '16px' }}>Employee List</h1>

      <div style={{ display: 'flex', gap: '8px', marginBottom: '16px' }}>
        <input
          type="text"
          placeholder="Enter Department Number"
          value={deptNo}
          onChange={(e) => setDeptNo(e.target.value)}
          style={{ padding: '8px', width: '200px', border: '1px solid #ccc', borderRadius: '4px' }}
        />
        <button
          onClick={handleSearch}
          style={{ padding: '8px 16px', backgroundColor: '#FF5C5C', color: '#fff', border: 'none', borderRadius: '4px', cursor: 'pointer' }}
        >
          Search
        </button>
      </div>

      <div>
        <table style={{ width: '100%', borderCollapse: 'collapse' }}>
          <thead>
            <tr style={{ backgroundColor: '#f2f2f2' }}>
              <th style={{ border: '1px solid #ddd', padding: '8px', textAlign: 'left' }}>Employee ID</th>
              <th style={{ border: '1px solid #ddd', padding: '8px', textAlign: 'left' }}>Name</th>
              <th style={{ border: '1px solid #ddd', padding: '8px', textAlign: 'left' }}>Department Number</th>
            </tr>
          </thead>
          <tbody>
            {employees.map((employee) => (
              <tr
              key={employee.id}
              style={{
                borderBottom: '1px solid #ddd',
                backgroundColor: (employee.id % 2 === 0) ? '#FF5C5C' : 'transparent',
              }}
            >
                <td style={{ padding: '8px' }}>{employee.id}</td>
                <td style={{ padding: '8px' }}>{employee.name}</td>
                <td style={{ padding: '8px' }}>{employee.deptNo}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default EmployeePage;

