import React from 'react'
import Left from './Left'
import Right from './Right'
function Compp2(props) {
  return (
    <div className='p-3 border border-3 border-success'>
      <div className='row'>
        <div className='col-3 border p-3 border-4'>
            <Left country={props.p1}/>
        </div>
        <div className='col-9 border p-3 border-4'>
            <Right country={props.p1}/>
        </div>
      </div>
    </div>
  )
}

export default Compp2
