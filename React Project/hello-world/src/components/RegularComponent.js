import React, { Component } from 'react'
class RegularComponent extends Component {
    render(){
        console.log("regular comp Render")
        return (
            <div>
                RegularComponent {this.props.name}
            </div>
        )
    }
}
export default RegularComponent