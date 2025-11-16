import React from 'react'

function Person(props) {
  return (
    <div>
        <h2>I am {props.person.name}, who is {props.person.age} years old, and posses {props.person.skill} skills</h2>
    </div>
  )
}
export default Person