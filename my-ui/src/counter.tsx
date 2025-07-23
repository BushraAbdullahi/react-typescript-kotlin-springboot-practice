import {useState} from "react";

type Props = {label: string}
function Counter(props: Props) {
    const [count, setCount] = useState(0)

    function handleClick(){
        setCount(count + 1)
    }
    return (
        <div>
            <h2>{props.label}: {count}</h2>
            <button onClick={handleClick}> Click Me</button>
        </div>
    )
}

export default Counter;