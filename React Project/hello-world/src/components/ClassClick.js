import React, { Component } from 'react'

class ClassClick extends Component {
    //No need to use function prefix as its inside a class. A class method
    clickHandler(){
        console.log("Button clicked");
        alert("Button clicked");
    }
    //Use this word for called the click handler function
    render() {
        return (
        <button onClick={this.clickHandler}>Click me</button>
        )
    }
}

export default ClassClick