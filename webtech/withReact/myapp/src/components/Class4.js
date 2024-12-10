import React, { Component } from 'react'
import axios from 'axios';
export default class Class4 extends Component {
    constructor(){
        super();
        this.state = {
            apidata: []
        }
    }

    componentDidMount(){
        axios.get('http://localhost:5243/heroes/dept')
        .then(res=>{
            console.log(res.data);
            this.setState({apidata: res.data})
        })
    }
  render() {
    var result = this.state.apidata;
    return (
      <div className='container'>
        <h1> Show Db</h1> <br />
        <div className='row'>
            {
                result && result.map((obj)=>
                <div className='col-3 text-center'>
                    <h3>{obj.id}</h3>
                    <h3>{obj.name}</h3>
                    <h3>{obj.location}</h3>

                </div>
                
                )
            }
        </div>
      </div>
    )
  }
}
