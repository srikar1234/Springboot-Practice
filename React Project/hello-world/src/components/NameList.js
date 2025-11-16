import React from 'react'
import Person from './Person'
function NameList() {
    // const names = ['Alice', 'Bob', 'Charlie'];
    // const nameList = names.map((name) =>{return <h2>{name}</h2>})
    // return (
    //     <div>
    //         {
    //            nameList
    //         }
    //     </div>
    // )

    // const names = ['Alice', 'Bob', 'Charlie'];
    // return (
    //     <div>
    //         {
    //             names.map((name) => <h2>{name}</h2>)
    //         }
    //     </div>
    // )
    // const persons =[
    //     {id: 1, name: 'STR', age: '15', skill: 'JS'},
    //     {id: 2, name: 'ABC', age: '25', skill: 'ReactJS'},
    //     {id: 3, name: 'MNO', age: '35', skill: 'NodeJS'}
    // ]
    // const PersonList = persons.map((person)=>{
    //     return <h2>I am {person.name}, who is {person.age} years old, and posses {person.skill} skills</h2>
    // })
    // return(
    //     <div>
    //         {
    //             PersonList
    //         }
    //     </div>
    // )

    const persons =[
        {id: 1, name: 'STR', age: '15', skill: 'JS'},
        {id: 2, name: 'ABC', age: '25', skill: 'ReactJS'},
        {id: 3, name: 'MNO', age: '35', skill: 'NodeJS'}
    ]
    const PersonList = persons.map((person)=>{
        return <Person key={person.id} person={person}></Person>
    })

    const names=['1234','567','890']
    const NamesList = names.map((name, index) => {
        return <h2 key={index} >{index}, {name}</h2>
    })
    return(
        <div>
            <div>
                {
                    PersonList
                }
            </div>
            <div>
                {
                    NamesList
                }
            </div>
        </div>
    )
}

export default NameList