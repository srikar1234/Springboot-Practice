import { useEffect, useState } from "react"
import React from 'react'

function HookMouse() {
  const [x, SetX] = useState(0)
  const [y, SetY] = useState(0)

  const logMousePosition = (event) =>{
    console.log("Mouse event logged")
    SetX(event.clientX)
    SetY(event.clientY)
  }
  useEffect(()=>{
    console.log("Use effect called" )
    window.addEventListener('mousemove', logMousePosition)
    
    //Unmount lifecycle code
    return ()=>{
      console.log("Cleanup function called")
      window.removeEventListener('mousemove', logMousePosition)
    }
  }, [])
  return (
    <div>
      HookMouse
      X - {x }
      Y - {y }
    </div>
  )
}

export default HookMouse