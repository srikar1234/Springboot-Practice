import React from 'react'
import { useState } from 'react'

function HookCounter() {
  //Array destructuring
  const [count, setCount] =useState(0)
  return (
    <div>
      HookCounter
      <button onClick={() =>{return setCount(count + 1)}}>Count {count}</button>
    </div>
  )
}

export default HookCounter