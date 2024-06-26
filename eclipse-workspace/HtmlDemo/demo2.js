function calculatearea(){
    let length=parseFloat(document.getElementById('length').value);
    let width=parseFloat(document.getElementById('width').value);
    let area =length * width;
    if(!isNaN(area)){
        document.getElementById('result').textContent='area:'+area.toFixed(2);
    }
    else{
        document.getElementById('result').textContent='invalid input.please enter number';  
    }
}