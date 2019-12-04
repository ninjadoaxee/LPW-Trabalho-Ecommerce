<%--
    Document   : produto
    Created on : 06/11/2019, 18:29:51
    Author     : Desenvolvimento
--%>


<%@page import="modelos.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalhes do Produto</title>
        <link href="css/produto.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <jsp:include page="menu.jsp">
            <jsp:param name="item" value="produtos" />
        </jsp:include>

        <div class="container">
            <div class="produto">
            <h2>Produto:</h2>

            <%
                int id =  Integer.parseInt(request.getParameter("id"));
                Produto p = Produto.lista.get(id);
            %>
            <h3><%=p.getDescricao()%></h3>
            <img src="<%=p.getImagem()%>"> </img>
            </div>
        
            <form action="AddCarrinho" method="post">
                <label>Quantidade</label><input name="quantidade" >
                <input name="id" value="<%=id%>" type="hidden">

                <button type="submit">OK</button>
            </form>
            
        </div>

    </body>
</html>