import React from 'react'
import Compp2 from './Compp2'


export default function Comp1() {
  return (
    <div className='container border border-5 border-danger'>
        <h1>Search</h1>
        <input type='text'/>
        <button>Search</button>
        <hr />
       <Compp2/>
    </div>
  )
}
