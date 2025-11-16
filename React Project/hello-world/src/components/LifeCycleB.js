import React, { Component } from 'react'

class LifeCycleB extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            name: 'SRI',
        }
        console.log("LifecycleB Constructor")
    }

    static getDerivedStateFromProps(props, state){
        console.log("LifeCycleB getDerivedStateFromProps called")
        return null;
    }
    
    componentDidMount(){
        console.log("LifeCycleB componentDidMount called")
    }
    
    render() {
        console.log("LifeCycleB render called")
        return (
            <div>LifeCycleB</div>
        )
    }
    
    getSnapshotBeforeUpdate(prevProps, prevState){
        console.log ("LifeCycle B getSnapshotBeforeUpdate called")

        return null
    }

    componentDidUpdate(prevProps, prevState, snapshot){
        console.log("LifeCycle B componentDidUpdate called")
    }

    shouldComponentUpdate(){
        console.log("shouldComponentUpdate called")
        return true;
    }
}

export default LifeCycleB