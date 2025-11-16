import './App.css';
import HookCounter from './components/HookCounter';
import ClassCounter from './components/classCounter';
import HookCounter2 from './components/HookCounter2';
import HookCounter3 from './components/HookCounter3';
import HookCounter4 from './components/HookCounter4';
import ClassCounter2 from './components/ClassCounter2';
import HookCounter5 from './components/HookCounter5';
import ClassMouse from './components/ClassMouse';
import HookMouse from './components/HookMouse';
import MouseContainer from './components/MouseContainer';
import IntervalHookCounter from './components/IntervalHookCounter.js';


function App() {
  return (
    <div className="App">
      {/* <ClassCounter></ClassCounter>
      <HookCounter></HookCounter>
      <HookCounter2></HookCounter2>
      <HookCounter3></HookCounter3>
      <HookCounter4></HookCounter4>
      <ClassCounter2></ClassCounter2>
      <HookCounter5></HookCounter5>
      <ClassMouse></ClassMouse>
      <HookMouse></HookMouse>
      <MouseContainer></MouseContainer> */}
      <IntervalHookCounter></IntervalHookCounter>
    </div>
  );
}
export default App;