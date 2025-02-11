const express = require('express');
const cors = require('cors');
const app = express();
const port = 3001;

app.use(cors());
app.use(express.json());

// Sample employee data
const employees = [
  { id: 1, name: 'Manish Devlikar', deptNo: '101' },
  { id: 2, name: 'Kunal', deptNo: '102' },
  { id: 3, name: 'Pratik', deptNo: '101' },
  { id: 4, name: 'Nishant', deptNo: '103' },
  { id: 5, name: 'krutarth', deptNo: '102' },
  { id: 6, name: 'suzy', deptNo: '104' },
  { id: 7, name: 'minami', deptNo: '101' },
  { id: 8, name: 'lisa', deptNo: '103' },
  { id: 9, name: 'emma', deptNo: '104' },
  { id: 10, name: 'rose', deptNo: '102' }
];

// Endpoint to get all employees or filter by department number
app.get('/api/employees', (req, res) => {
  const deptNo = req.query.deptNo;
  if (deptNo) {
    const filteredEmployees = employees.filter(emp => emp.deptNo === deptNo);
    return res.json(filteredEmployees);
  }
  res.json(employees);
});

app.listen(port, () => {
  console.log(`Employee API server running at http://localhost:${port}`);
});
