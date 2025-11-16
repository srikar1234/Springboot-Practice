import React, { Component, PureComponent } from 'react'
import RegularComponent from './RegularComponent'
import PureComp from './PureComponent'
import MemoComp from './MemoComp'
class ParentComp extends  Component {
    constructor(props) {
        super(props)
        this.state = {
            name: 'Parent',
        }
    }

    componentDidMount() {
        setInterval(()=>{
            this.setState({
                name: 'Blah blah'})
        }, 2000)
    }

    render() {
        console.log("ParentComp Render")
        return (
            <div>
                ParentComp
                {/* <RegularComponent name = {this.state.name}>

                </RegularComponent >
                <PureComp name = {this.state.name}>

                </PureComp> */}

                <MemoComp name={this.state.name}> </MemoComp>
            </div>
        )
    }
}

export default ParentComp