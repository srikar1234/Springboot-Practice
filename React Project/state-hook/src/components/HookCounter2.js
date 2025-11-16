import React from 'react'
import { useState } from 'react'



function HookCounter2() {
  const initialValue = 0;
  const [count, setCount] = useState(0);
  return (
    <div>
      HookCounter2
      <button onClick={()=>{
        return setCount((prevCount)=>{return prevCount+1})
      }}>Increment {count}</button>
      <button onClick={()=>{
        return setCount((prevCount) =>{return prevCount -1})
      }}>Decrement {count}</button>
      <button onClick={()=>{
        return setCount(initialValue)
      }}>Reset {count}</button>
    </div>
  )
}

export default HookCounter2