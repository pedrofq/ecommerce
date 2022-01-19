<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String json = (String) request.getAttribute("json");
%>

<html>
    <head>
        <title>Produtos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="CSS/style__css__cadastro.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">

        <script>
            //Recebe a string no formado JSON da aplicação Java, por meio de requisição HTTP
            var json = <%=json%>
            
            //Transforma a string JSON em Array no JS
            var lista = json.map(item => Object.keys(item).map(i => item[i]))
            console.log(lista)

            function mostrarProdutos(arr) {
                const tableBody = document.getElementById('tableBody');
                let dataHtml = '<tr>';
                let contador = 1;

                for (let produto of arr) {
                    if (produto[4] > 0) {
                        dataHtml += `<td><img style='width: 85px;' src="`+produto[2]+`"><td><a href="/carrinho/?id=`+produto[0]+`">`+produto[1]+` - </a>`+produto[3]+`, Adicionar ao carrinho</td></td>`     
                        if (contador % 3 == 0) {
                            dataHtml += `</tr><tr>`
                        }
                    } else {
                        dataHtml += `<td><img style='width: 85px;' src="`+produto[2]+`"><td><a href="/carrinho/?id=`+produto[0]+`">`+produto[1]+` - </a>`+produto[3]+`, FORA DE ESTOQUE</td></td>`     
                        if (contador % 3 == 0) {
                            dataHtml += `</tr><tr>`
                        }
                    }

                    contador++;
                }
               
                tableBody.innerHTML = dataHtml;
            }
            
        </script>

    </head>

    <body class="container2">

        
        <form method="post" action="ordenarProdutos.jsp">
            <p>Ordenar</p>
            <select name="ordenarProdutos">
                <option value="0">Selecione</option>
                <option value="1">Menor preço</option>
                <option value="2">Maior preço</option>
                <option value="3">Ordem alfabética</option>
            </select>
            <input type="submit" value="Enviar" />     
        </form>
        <table border ="0px" id="tableBody">
        </table>
    </body>
    
    <script>mostrarProdutos(lista);</script>
</html>

