let digiteAlgo = document.querySelector('#digiteAlgo');

function validaCampo() {
  if (digiteAlgo.value.length < 5 ) {
    digiteAlgo.style.color = 'red';
    digiteAlgo.style.border = '1px solid red'
  } else {
    digiteAlgo.style.color = 'green'
    digiteAlgo.style.border = '1px solid green';
  }
}

let modal = document.getElementById('myModal')
let btn = document.getElementById('myBtn')
let span = document.getElementsByClassName('close')[0]

btn.onclick = function(){
    modal.style.display = 'block';
}

span.onclick = function(){
    modal.style.display = 'none';
}

window.onclick= function(event){
    if (event.target == modal) {
        modal.style.display = 'none';
    }
}