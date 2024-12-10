import React from 'react';
import ReactDOM  from 'react-dom/client';
import App from './components/App';
import Home from './components/Home';
import Show from './components/Show';
import PageNotFound from './components/PageNotFound';
import'./style.css'
import Login from './components/Login';
import Register from './components/Register';
import Add from './components/Add';

import {
    createBrowserRouter,
    RouterProvider,
  } from "react-router-dom";
import Class1 from './components/Class1';
import Class2 from './components/Class2';
import Class3 from './components/Class3';
import Class4 from './components/Class4';


const ans = ReactDOM.createRoot(document.getElementById('root'));
const router = createBrowserRouter([
    {
        path: '/',
        element: <App/>,
        children: [
            {path: '', element: <Home/>},
            {path: 'Login', element: <Login/>},
            {path: 'Register', element: <Register/>},
            {path: 'Add', element: <Add/>},
            {path: 'Show', element: <Show/>},
            {path: 'Class1', element: <Class1 name='user1' age='22' place='kalyan'/>},
            {path: 'Class2', element: <Class2/>},
            {path: 'Class3', element: <Class3/>},
            {path: 'Class4', element: <Class4/>},
            {path: '*', element: <PageNotFound/>},

        ]
    }
])

ans.render(<RouterProvider router={router} />);

