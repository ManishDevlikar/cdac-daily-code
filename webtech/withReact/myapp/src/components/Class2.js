import React, { Component } from 'react'
import axios from 'axios';

export default class Class2 extends Component {
    constructor(){
        super();
        this.x1 = React.createRef();
        this.x2 = React.createRef();
        this.x3 = React.createRef();
    }
    myFunc(){
        var name = this.x1.current.value;
        console.log(name);
        var price = this.x2.current.value;
        var path = this.x3.current.value;

        axios.post("http://localhost:5243/heroes/dept", {'id': name, 'name': price, 'location': path})
        .then(res=>{
            console.log(res);
        })
    }

    
  render() {
    return (
      <div className='container'>
        <h1>Add record</h1>
        
            <input ref={this.x1} placeholder='Name'></input> <br />
            <input ref={this.x2} placeholder='Price'></input> <br />
            <input ref={this.x3} placeholder='Path'></input> <br />
            <button onClick={()=> {this.myFunc() }}>Add</button>
        
      </div>
    )
  }
}
