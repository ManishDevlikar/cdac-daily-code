import React from 'react'
import Header from './Header'
import Home from './Home'
import Footer from './Footer'
import { Outlet } from 'react-router-dom'


function App() {
  return (
    <div>
      <Header />
      <Outlet/>
      <Footer />
    </div>
  )
}

export default App
