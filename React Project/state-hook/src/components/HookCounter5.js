import React from 'react'
import { useEffect} from 'react'
import { useState } from 'react'
function HookCounter5() {
  const [count, setCount] = useState(0);
  const [name, setName] = useState('');
  //Runs after each render
  useEffect(()=>{
    console.log("Updating doc title")
    document.title = `Clicked ${count} times`
  }, [count])
  const incrementCount =() =>{
    setCount((prevCount) => {return prevCount + 1})
  }

  return (
    <div>
      HookCounter5
      <input type="text" value={name} onChange={(event) => setName(event.target.value)}/>
      <button onClick={incrementCount}>
        Click me {count} times
      </button>  
    </div>
  )
}

export default HookCounter5