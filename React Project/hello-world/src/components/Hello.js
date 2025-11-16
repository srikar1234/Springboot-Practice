import React from "react";

const Hello = () =>{
    // return (
    //     <div>
    //         <h1>Hello, World!</h1>;
    //     </div>
    // )

    //The second paramter is a dictornary object containing key value pairs that are describing the tag at that level
    return React.createElement('div', {id: "div tag", className: "aBcde"}, React.createElement('h1', null, 'Hello World'));
}

export default Hello;