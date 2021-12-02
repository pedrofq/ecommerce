function modificarCorFundo(color){
    document.getElementById("container").style.backgroundColor = color;
    
    if (color === '#FFFFFF'){
        document.getElementById("header-id").style.color = '#1a1a1a';
    }
    else{
        document.getElementById("header-id").style.color = '#FFFFFF';
    }
}

