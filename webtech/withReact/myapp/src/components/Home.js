import React from 'react'
import Product from './Product'

function Home() {
  return (
    <div className='container'>
        <div className='row'>
            <div className='col-xl-3'>
                <Product name="Shirt" price="1200"/>
            </div>
            <div className='col-xl-3'>
                <Product name="Trousers" price="2000"/>
            </div>
            <div className='col-xl-3'>
                <Product name="Shoes" price="2500"/>
            </div>
            <div className='col-xl-3'>
                <Product name="Watch" price="6200"/>
            </div>
        </div>


      
    </div>
  )
}

export default Home
