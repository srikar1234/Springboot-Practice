import React from 'react'

function MemoComp({name}) {
    console.log("Render memo component")
    return (
    <div>MemoComp {name}</div>
  )
} 

//Higher order components
export default React.memo(MemoComp) 