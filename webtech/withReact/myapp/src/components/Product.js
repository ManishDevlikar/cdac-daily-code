import react from "react";

export default function Product(props) {
    console.log(props);
    function myFunc() {
        props.price = 9000;
    }

    return(
        <div className="text-center">
            <h4>{props.name}</h4>
            <p>{props.price}</p>
            <button onClick={myFunc}>Add me</button>
        </div>
    )
}
