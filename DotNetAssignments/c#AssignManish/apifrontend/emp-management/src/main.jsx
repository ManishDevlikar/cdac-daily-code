import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import EmployeeList from './component/EmployeeList'
import EmployeeForm from './component/EmployeeForm'
import Footer from './component/Footer'


createRoot(document.getElementById('root')).render(
  <StrictMode>
   <EmployeeList/>
   <EmployeeForm/>
   <Footer/>
  </StrictMode>,
)
