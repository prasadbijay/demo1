let boxes= document.querySelectorAll(".box");
let resetbtn=document.querySelector("#reset-btn");
let newGamebtn=document.querySelector("#new-btn")
let msgcontainer=document.querySelector(".msg-container")
let msg=document.querySelector("#msg")

let turno=true;
const winpattern = [
    [0,1,2],
    [0,3,6],
    [0,4,8],
    [1,4,7],
    [2,4,6],
    [2,5,8],
    [3,4,5],
    [6,7,8]
];
const resetgame = () => {
    turno = true;
    enableboxes();
    msgcontainer.classList.add("hide");
};

boxes.forEach((box)=>{
    box.addEventListener("click",()=>{
        if(turno){
            box.innerHTML="0";
            turno=false;
        }
        else{
            box.innerHTML="X";
            turno=true;
        }
        box.disabled=true;
        checkWinner();
    });
});
const disableboxes =() =>{
    for(let box of boxes){
        box.disabled = true;
    }
}
const enableboxes =() =>{
    for(let box of boxes){
        box.disabled = false;
        box.innerText="";
    }
}
const showWinner=(winner) =>{
    msg.innerHTML=`congratulation,winner is ${winner}`;
    msgcontainer.classList.remove("hide");
    disableboxes();
}
const checkWinner=()=>{
    for(let pattern of winpattern){
    let pos1val = boxes[pattern[0]].innerHTML;
    let pos2val = boxes[pattern[1]].innerHTML;
    let pos3val = boxes[pattern[2]].innerHTML;

    if(pos1val != "" && pos2val != "" && pos3val !=""){
        if(pos1val===pos2val && pos2val===pos3val){
            showWinner(pos1val);
        }
    }
}
};

newGamebtn.addEventListener("click",resetgame);
 resetbtn.addEventListener("click",resetgame);
