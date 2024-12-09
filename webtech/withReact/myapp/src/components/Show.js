import React, { useEffect ,useState} from 'react'

function Show() {
  var [data, setdata] = useState([]);
  
  useEffect(()=>{
    fetch('http://localhost:5243/heroes/dept')
    .then(res=>res.json())
    .then(val =>{
      console.log(val);
      setdata(val);
    })
  },[])
  return (
    <div className='container'>
      <h1>Show data from API</h1>
       <table className='table'>
          <tr>
            <th>employeeId</th>
            <th>employeeName</th>
            <th>location</th>
          </tr>
          {
            data.map((number) =>
            <tr>
              <td>{number.id}</td>
              <td>{number.name}</td>
              <td>{number.location}</td>
            </tr>
            )
          }
       </table> 
    </div>
  )
}

export default Show