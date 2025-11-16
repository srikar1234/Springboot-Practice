import React, { Component } from 'react'

class Counter extends Component {
    constructor(props) {
      super(props)
      this.state = {
            count: 0,
      }
    }
    increment(){
        //Async call with callback
        // this.setState(
        //     {
        //         count: this.state.count + 1,
        //     },
        //     ()=>{ 
        //         console.log(this.state.count);
        //     }
        // )
        
        this.setState((prevState, props) => ({
           count: prevState.count + 1, 
        }));
        //syc call -> will call before the inner log function
        console.log(this.state.count);
    }

    incrementFive(){
        this.increment();
        this.increment();
        this.increment();
        this.increment();
        this.increment();
    }
    render() {
        return (
            <div>
                <div>Count - {this.state.count}</div>
                <button onClick={
                    ()=>{
                        //this.increment();
                        this.incrementFive();
                    }
                }>Increment</button>
            </div>
        )
    }
}

export default Counter