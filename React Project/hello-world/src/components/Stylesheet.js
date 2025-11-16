import React from 'react'
import './myStyle.css'
function Stylesheet(props) {
    let className = props.primary ? 'primary': 'secondary'
  return (
    <div>
        <h1 class={`${className} font-xl` }>Stylesheets</h1>
    </div>
  )
}

export default Stylesheet