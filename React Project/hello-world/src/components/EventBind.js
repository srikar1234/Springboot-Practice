import React, { Component } from 'react'

class EventBind extends Component {
    // constructor(props) {
    //   super(props)
    
    //   this.state = {
    //     message: 'hello'
    //   }
    // }
    // clickHandler(){
    //     this.setState({
    //         message: 'Goodbye'
    //     })
    //     console.log(this)
    // }

    // //Render binding
    // render() {
    //     return (
    //         <div>
    //             <div>{this.state.message}</div>
    //             {/* <button onClick={this.clickHandler.bind(this)}>Click</button>
    //              */}
    //              <button onClick={() => this.clickHandler()}>Click</button>
    //         </div>
        
    //     )
    // }

    //Constrcutor binding
    // constructor(props) {
    //     super(props)
    //     this.state = {
    //       message: 'hello'
    //     }

    //     //Bind here
    //     this.clickHandler = this.clickHandler.bind(this)
    // }
    // clickHandler(){
    //     this.setState({
    //         message: 'Goodbye'
    //     })
    //     console.log(this)
    // }


    constructor(props) {
        super(props)
        this.state = {
          message: 'hello'
        }
    }
    //class property arrow function
    clickHandler =() =>{
        this.setState({
            message: 'Goodbye'
        })
        console.log(this)
    }
    
    render() {
        return (
            <div>
                <div>{this.state.message}</div>
                <button onClick={this.clickHandler}>Click</button>
            </div>
        )
    }
}

export default EventBind