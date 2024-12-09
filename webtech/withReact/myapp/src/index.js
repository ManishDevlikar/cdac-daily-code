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
            {path: '*', element: <PageNotFound/>},
        ]
    }
])

ans.render(<RouterProvider router={router} />);

