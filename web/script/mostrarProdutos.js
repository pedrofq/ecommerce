var listaProdutos = [
    {id: '1', descricao: 'Pc Gamer Bravus Core i7 GTX 1650 16gb Hd 1tb SSD 120gb', preco: '1999.90', foto: 'https://m.media-amazon.com/images/I/517bRVOukcL._AC_.jpg', quantidade: 95, categorias: ['informática', 'games']},
    {id: '2', descricao: 'Smart TV LED 55” LG 55UP7550 4K UHD', preco: '2889.90', foto: 'https://a-static.mlcdn.com.br/618x463/smart-tv-55-ultra-hd-4k-led-lg-55up7550-60hz-wi-fi-e-bluetooth-alexa-2-hdmi-1-usb/magazineluiza/228863800/713cf3564f7fb6de44f683bf6b5d95c1.jpg', quantidade: 10, categorias: ['informática', 'casa']}, 
    {id: '3', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']},
    {id: '4', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']},
    {id: '3', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']},
    {id: '1', descricao: 'Pc Gamer Bravus Core i7 GTX 1650 16gb Hd 1tb SSD 120gb', preco: '1999.90', foto: 'https://m.media-amazon.com/images/I/517bRVOukcL._AC_.jpg', quantidade: 95, categorias: ['informática', 'games']},
    {id: '2', descricao: 'Smart TV LED 55” LG 55UP7550 4K UHD', preco: '2889.90', foto: 'https://a-static.mlcdn.com.br/618x463/smart-tv-55-ultra-hd-4k-led-lg-55up7550-60hz-wi-fi-e-bluetooth-alexa-2-hdmi-1-usb/magazineluiza/228863800/713cf3564f7fb6de44f683bf6b5d95c1.jpg', quantidade: 10, categorias: ['informática', 'casa']}, 
    {id: '3', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']},
    {id: '1', descricao: 'Pc Gamer Bravus Core i7 GTX 1650 16gb Hd 1tb SSD 120gb', preco: '1999.90', foto: 'https://m.media-amazon.com/images/I/517bRVOukcL._AC_.jpg', quantidade: 95, categorias: ['informática', 'games']},
    {id: '2', descricao: 'Smart TV LED 55” LG 55UP7550 4K UHD', preco: '2889.90', foto: 'https://a-static.mlcdn.com.br/618x463/smart-tv-55-ultra-hd-4k-led-lg-55up7550-60hz-wi-fi-e-bluetooth-alexa-2-hdmi-1-usb/magazineluiza/228863800/713cf3564f7fb6de44f683bf6b5d95c1.jpg', quantidade: 10, categorias: ['informática', 'casa']}, 
    {id: '3', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']},
    {id: '1', descricao: 'Pc Gamer Bravus Core i7 GTX 1650 16gb Hd 1tb SSD 120gb', preco: '1999.90', foto: 'https://m.media-amazon.com/images/I/517bRVOukcL._AC_.jpg', quantidade: 95, categorias: ['informática', 'games']},
    {id: '2', descricao: 'Smart TV LED 55” LG 55UP7550 4K UHD', preco: '2889.90', foto: 'https://a-static.mlcdn.com.br/618x463/smart-tv-55-ultra-hd-4k-led-lg-55up7550-60hz-wi-fi-e-bluetooth-alexa-2-hdmi-1-usb/magazineluiza/228863800/713cf3564f7fb6de44f683bf6b5d95c1.jpg', quantidade: 10, categorias: ['informática', 'casa']}, 
    {id: '3', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']},
    {id: '1', descricao: 'Pc Gamer Bravus Core i7 GTX 1650 16gb Hd 1tb SSD 120gb', preco: '1999.90', foto: 'https://m.media-amazon.com/images/I/517bRVOukcL._AC_.jpg', quantidade: 95, categorias: ['informática', 'games']},
    {id: '2', descricao: 'Smart TV LED 55” LG 55UP7550 4K UHD', preco: '2889.90', foto: 'https://a-static.mlcdn.com.br/618x463/smart-tv-55-ultra-hd-4k-led-lg-55up7550-60hz-wi-fi-e-bluetooth-alexa-2-hdmi-1-usb/magazineluiza/228863800/713cf3564f7fb6de44f683bf6b5d95c1.jpg', quantidade: 10, categorias: ['informática', 'casa']}, 
    {id: '3', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']},
    {id: '1', descricao: 'Pc Gamer Bravus Core i7 GTX 1650 16gb Hd 1tb SSD 120gb', preco: '1999.90', foto: 'https://m.media-amazon.com/images/I/517bRVOukcL._AC_.jpg', quantidade: 95, categorias: ['informática', 'games']},
    {id: '2', descricao: 'Smart TV LED 55” LG 55UP7550 4K UHD', preco: '2889.90', foto: 'https://a-static.mlcdn.com.br/618x463/smart-tv-55-ultra-hd-4k-led-lg-55up7550-60hz-wi-fi-e-bluetooth-alexa-2-hdmi-1-usb/magazineluiza/228863800/713cf3564f7fb6de44f683bf6b5d95c1.jpg', quantidade: 10, categorias: ['informática', 'casa']}, 
    {id: '3', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']},
    {id: '1', descricao: 'Pc Gamer Bravus Core i7 GTX 1650 16gb Hd 1tb SSD 120gb', preco: '1999.90', foto: 'https://m.media-amazon.com/images/I/517bRVOukcL._AC_.jpg', quantidade: 95, categorias: ['informática', 'games']},
    {id: '2', descricao: 'Smart TV LED 55” LG 55UP7550 4K UHD', preco: '2889.90', foto: 'https://a-static.mlcdn.com.br/618x463/smart-tv-55-ultra-hd-4k-led-lg-55up7550-60hz-wi-fi-e-bluetooth-alexa-2-hdmi-1-usb/magazineluiza/228863800/713cf3564f7fb6de44f683bf6b5d95c1.jpg', quantidade: 10, categorias: ['informática', 'casa']}, 
    {id: '3', descricao: 'SAMSUNG Galaxy A01 32gb', preco: '899.99', foto: 'https://a-static.mlcdn.com.br/618x463/celular-samsung-galaxy-a01-32gb-a015/valdarmoveis/1550/a853959983610a7866185522b27629d7.jpg', quantidade: 258, categorias: ['informática', 'celular']}
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
            dataHtml += `<td><img style='width: 85px;' src=${produto.foto}><td><a href="/${produto.id}">${produto.descricao} - </a>${produto.preco}, Adicionar ao carrinho</td></td>`;
            if(contador % 3 == 0){
                dataHtml += `</tr><tr>`
            }
        }
        else{
            dataHtml += `<td><img style='width: 85px;' src=${produto.foto}><td><a href="/${produto.id}">${produto.descricao} - </a>${produto.preco}, FORA DE ESTOQUE</td></td>`;
            if(contador % 3 == 0){
                dataHtml += `</tr><tr>`
            }
        }
        
        contador++;
    }
    
    tableBody.innerHTML = dataHtml;
};
 
 


