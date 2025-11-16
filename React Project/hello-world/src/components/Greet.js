import React from "react";

// function Greet(){
//     return <h1>Hello, World!</h1>;
// }

// const Greet = (names)=> {
//     console.log(names);
//     //JSX can return only one HTML tag, so wrap evrything under one tag
//     return (
//     <div>
//         <h1>Hello, {names.name} aka {names.heroname} </h1>
//         {names.children}
//     </div>
//     )
// }

//After destructuring the props in the parameters
// const Greet = ({name, heroname, children})=> {
//     // console.log(names);
//     //JSX can return only one HTML tag, so wrap evrything under one tag
//     return (
//     <div>
//         <h1>Hello, {name} aka {heroname} </h1>
//         {children}
//     </div>
//     )
// }

//Destructuring the props inside the function body
const Greet = (props)=> {
    console.log(props);
    const {name, heroname, children} = props
    //JSX can return only one HTML tag, so wrap evrything under one tag
    return (
    <div>
        <h1>Hello, {name} aka {heroname} </h1>
        {children}
    </div>
    )
}

// named exports
// export const Greet =() => <h1>Hello, World!</h1>

//default exporting the class
export default Greet;