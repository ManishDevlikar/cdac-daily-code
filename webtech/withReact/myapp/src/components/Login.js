import React, { useRef } from 'react'

function Login() {

  let deptno = useRef();
  let name = useRef();
  let location = useRef();
  function loginFunction() {
    deptno=deptno.current.value;
    name=name.current.value;
    location=location.current.value;
    
    fetch('http://localhost:5243/heroes/dept', { 
    method: 'POST', 
    body: JSON.stringify({ "id": deptno , "name":name,"location":location}),
    headers: { 'Content-Type': 'application/json' } }) 
    .then(response => { 
      if (!response.ok) { throw new Error('Network response was not ok ' + response.statusText);} 
   return ; }) 
   .then(data => console.log('Success:', data)) 
    .catch(error => console.error('Error:',error));


  }
  return (
    <div>
      <h3>Login form</h3>
      <input type="text" placeholder='deptno' ref={deptno}/> <br/>
      <input type="text" placeholder='dname' ref={name}/> <br/>
      <input type="password" placeholder='location' ref={location}/> <br/>
      <button onClick={loginFunction}>Log In</button>
    </div>
  )
}

export default Login
