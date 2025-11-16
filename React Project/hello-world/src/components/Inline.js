import React from 'react'

function Inline() {
    const heading = {
        fontSize: '72px',
        color: 'green',
        fontStyle: 'italic',
    }
    return (
        <div>
            <h1 style={heading}>Inline</h1>
        </div>
    )
}

export default Inline