const senha = document.getElementById("senha");
const senha2 = document.getElementById("senha2");
const form = document.getElementById("form");
const erroSenha = document.getElementById("erroSenha");



form.addEventListener('submit', (e) => {
    let mensagens = [];
    let senhaValue = senha.value;
    
    if(senha.value !== senha2.value){
        mensagens = [];
        mensagens.push("As senhas não coincidem");
        e.preventDefault();
        erroSenha.innerText = mensagens; 
    } 

    if(senhaValue.length < 6){
        mensagens = [];
        mensagens.push("Digite uma senha maior que 6 dígitos");
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


