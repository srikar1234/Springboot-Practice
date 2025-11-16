import logo from './logo.svg';
import React from 'react';
import './App.css';
import Greet from './components/Greet';
import Welcome from './components/Welcome';
import Hello from './components/Hello';
import Counter from './components/Counter';
import FunctionClick from './components/FunctionClick';
//named export
// import {Greet} from './components/Greet';
import ClassClick from './components/ClassClick';
import EventBind from './components/EventBind';
import ParentComponent from './components/ParentComponent';
import UserGreeting from './components/UserGreeting';
import NameList from './components/NameList';
import Stylesheet from './components/Stylesheet';
import Inline from './components/Inline';
import Form from './components/Form';
import LifeCycleA from './components/LifeCycleA';
import FragmentDemo from './components/FragmentDemo';
import Table from './components/Table';
import PureComponent from './components/PureComponent';
import ParentComp from './components/ParentComp';
import RefsDemo from './components/RefsDemo';
import FocusInput from './components/FocusInput';
import FRParentInput from './components/FRParentInput';

function App() {
	return (
    <div className="App">
      {/* <Greet></Greet>
      
      <Welcome/>
      
      <Hello/>
      
      <Greet name="ABC" heroname="XYZ"> 
        <p>This is a chisldren tag</p>
      </Greet>
      
      <Greet name="DEF" heroname="UVW">
        <button>Action</button>
      </Greet>
      
      <Greet name="GHI" heroname="RST"></Greet>
      
      <Welcome name="ABC" heroname="XYZ">
        <p>This is a children tag</p>
      </Welcome>
      
      <Counter></Counter>
      
      <FunctionClick></FunctionClick>
      
      <ClassClick></ClassClick>

      <EventBind></EventBind>
      <ParentComponent></ParentComponent>
      <UserGreeting></UserGreeting>
      <NameList></NameList>
      <Stylesheet primary={false}></Stylesheet>
      <Inline></Inline> */}
      {/* <Form></Form>
      <LifeCycleA></LifeCycleA>
      <FragmentDemo></FragmentDemo>
      <Table></Table>  */}
      {/* <PureComponent></PureComponent>
      <ParentComp></ParentComp>
       */}

       {/* <RefsDemo></RefsDemo> */}
       <FocusInput></FocusInput>
       <FRParentInput></FRParentInput>
    </div>
  );
}
export default App;