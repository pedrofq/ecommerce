var listaProdutos = [
    {id: '1', descricao: 'Computador', preco: '1999.90', foto: 'LINK', quantidade: 95},
    {id: '2', descricao: 'Televisão', preco: '2999.90', foto: 'LINK', quantidade: 10}, 
    {id: '3', descricao: 'Celular', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258},
    {id: '3', descricao: 'Celular', preco: '899.99', foto: 'LINK', quantidade: 258},
    {id: '3', descricao: 'Celular', preco: '899.99', foto: 'LINK', quantidade: 258},
    {id: '3', descricao: 'Celular', preco: '899.99', foto: 'LINK', quantidade: 0},
    {id: '3', descricao: 'Celular', preco: '899.99', foto: 'LINK', quantidade: 258}
];

window.onload = () => {
    mostrarProdutos(listaProdutos);
};

function mostrarProdutos(listaProdutos){
    const tableBody = document.getElementById('tableBody');
    let dataHtml = '<tr>';
    let contador = 1;
    
    for(let produto of listaProdutos){
        if(produto.quantidade > 0){
            dataHtml += `<td><img style='width: 100px;' src=${produto.foto}><a href="/${produto.id}">${produto.descricao}</a> ${produto.preco}</td>`;
            if(contador % 3 == 0){
                dataHtml += `</tr><tr>`
            }
        }
        else{
            dataHtml += `<td><img src=${produto.foto}><a href="/${produto.id}">${produto.descricao}</a> FORA DE ESTOQUE</td>`;
            if(contador % 3 == 0){
                dataHtml += `</tr><tr>`
            }
        }
        
        contador++;
    }
    
    tableBody.innerHTML = dataHtml;
};
 
 


