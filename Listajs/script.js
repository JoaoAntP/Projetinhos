//Capturara os elementos dentro da div app
let elementoInput = document.querySelector('#app input');
let elementoButton = document.querySelector('#app button');
let elementoUl = document.querySelector('#app ul');


let listas = JSON.parse(localStorage.getItem('lista_tarefas')) || [];
//let listas = [
//];


function mostrarListas(){
    elementoUl.innerHTML = '';
    for(let lista of listas) {
            //console.log(listas);
          let elementoLista = document.createElement('li');
          let textoLista = document.createTextNode(lista);
          let elementoLink =  document.createElement('a');
          let posicao = listas.indexOf(lista);
          elementoLink.setAttribute('onclick', 'deletarLista('+posicao+')' );
          elementoLink.setAttribute('href', '#');
          let textoLink = document.createTextNode(' Excluir');
          elementoLink.appendChild(textoLink);

          elementoLista.appendChild(textoLista);
          elementoLista.appendChild(elementoLink);
          elementoUl.appendChild(elementoLista);
    }
}

 mostrarListas();

function adicionarLista(){

    if(elementoInput.value == ''){
        alert('Digite uma tarefa!');
        return;
    }else{
        let textoLista = elementoInput.value;
        listas.push(textoLista);
        elementoInput.value = '';
        mostrarListas();
        salvarLista();
    }
}

elementoButton.onclick = adicionarLista;

function deletarLista(posicao){
    //alert("Teste de delete");
    listas.splice(posicao, 1);
    mostrarListas();
    salvarLista();
}

function salvarLista(){
    localStorage.setItem('lista_tarefas', JSON.stringify(listas));
}