import React, { Component } from 'react'

export default class Class1 extends Component {
    constructor(){
        super();
        console.log('Class1 constructor');

    }
    myFunc(){
        this.props.name = 'Class2';
    }
    render() {
        console.log('Mounted');
    return (
      <div className='container'>
        <h1> Props </h1>
        <p>{this.props.name} {this.props.age} {this.props.place}</p>
        <button onClick={()=>{this.myFunc()}}>Enter</button>
      </div>
    )
  }
}