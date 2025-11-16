import React from 'react'
import { useState } from 'react'
function HookCounter3() {
  const [name, setName] = useState({
    firstname: '',
    lastname:'',
  })
  return (
    <div>
      HookCounter3
      <form>
        <label >firsname</label>
        <input type="text" 
        value={name.firstname} 
        onChange={(event)=>{return setName({...name, firstname: event.target.value})
        }}></input>

        {/* Spread Operator */}
        <label >lastname</label>
        <input type="text" value={name.lastname} onChange={(event)=>{return setName({...name, lastname:event.target.value})}}></input>
        <div>
          <h2>{name.firstname}</h2>
        </div>
        <div>
          <h2>{name.lastname}</h2>
        </div>
        <div>
          <h2>{JSON.stringify(name)}</h2>
        </div>
      </form>
    </div>
  )
}

export default HookCounter3