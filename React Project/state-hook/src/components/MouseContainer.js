import React, {useState} from 'react'
import HookMouse  from './HookMouse'

function MouseContainer() {
  const [display, setDisplay] = useState(true)
  return (
    <div>
      <button onClick={()=>{return setDisplay(!display)}}>ToggleDisplay</button>
      {display && <HookMouse></ HookMouse>}
    </div>
  )
}

export default MouseContainer