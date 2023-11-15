import React from 'react';
import { App } from "./App.js";
import ReactDOM from 'react-dom/client';

if(process.env.NODE_ENV === 'production'){
    console.log= ()=>{};
    console.error= ()=>{};
    console.debug= ()=>{};
    console.info= ()=>{};
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <App/>
    </React.StrictMode>       
);