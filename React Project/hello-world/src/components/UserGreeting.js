import React, { Component } from 'react'

class UserGreeting extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            isLoggedIn: true,
        }
    }
    render() {
        //if/else rendering
        // if(this.state.isLoggedIn)
        //     return <div>Welcome User</div>
        // else
        //     return (
        //         <div>
        //             <div>Welcome Guest</div>
        //         </div>
        //     )
        // element variable rendering
        // message is the element variable
        // let message
        // if(this.state.isLoggedIn)
        //     message = <div>Welcome User</div>
        // else
        //     message = <div>Welcome Guest</div>
        // return (
        //     <div>
        //         {message}
        //     </div>
        // )
        //Ternary Condition operator
        // return this.state.isLoggedIn?(<div>Welcome user</div>):(<div>Welcome guest</div>)

        //Short Circuit Operator approach
        //Renders either a 'Welcome User' msg or nothing
        return this.state.isLoggedIn && <div>Welcome User</div> 
    }
}

export default UserGreeting