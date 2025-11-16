import React, { Component } from 'react'
import LifeCycleB from './LifeCycleB'

class LifeCycleA extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            name: 'SRI',
        }
        console.log("LifecycleA Constructor")

        this.changeState = this.changeState.bind(this)
    }
    changeState =() => {
        this.setState({
            name: 'SRI Updated'
        })
        console.log("LifeCycle A  State changed")
    }
    static getDerivedStateFromProps(props, state){
        console.log("LifeCycle A getDerivedStateFromProps called")
        return null;
    }

    shouldComponentUpdate(){
        console.log("LifeCycle A shouldComponentUpdate called")
        return true;
    }
    
    componentDidMount(){
        console.log("LifeCycle A componentDidMount called")
    }


    getSnapshotBeforeUpdate(prevProps, prevState){
        console.log ("LifeCycle A getSnapshotBeforeUpdate called")
        return null
    }

    componentDidUpdate(prevProps, prevState, snapshot){
        console.log("LifeCycle A componentDidUpdate called")
    }
    
    render() {
        console.log("LifeCycleA render called")
        return (
            <div>
                <div>LifeCycleA</div>
                <button onClick={this.changeState}>
                    Change State
                </button>
                <LifeCycleB/>
            </div>
        )
    }

}

export default LifeCycleA