const senha = document.getElementById("senha");
const senha2 = document.getElementById("senha2");
const form = document.getElementById("form");
const erroSenha = document.getElementById("erroSenha");

form.addEventListener('submit', (e) => {
    let mensagens = [];
    
    if(senha.value !== senha2.value){
        mensagens.push("As senhas não coincidem");
    }  
    if(mensagens.length > 0){
        e.preventDefault();
        erroSenha.innerText = mensagens;     
    }
});

function mascara_cpf(i){

    let num = i.value;
   
   if(isNaN(num[num.length-1])){
      i.value = null;
      return null;
   }
   
   i.setAttribute("maxlength", "14");
   if (num.length == 3 || num.length == 7) i.value += ".";
   if (num.length == 11) i.value += "-";

}

function isNumberCheck(t){
    let num = t.value;
    
    if(isNaN(num[num.length-1])){
        t.value = null;
        return null;
    }
    
}


