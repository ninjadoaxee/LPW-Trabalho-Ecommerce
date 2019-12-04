<%--
    Document   : index
    Created on : 21/08/2019, 17:26:44
    Author     : gutol
--%>

<%@page import="modelos.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ofertas da Loja</title>
        <link href="css/ofertas.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css">
 
    </head>
    <body>

        <jsp:include page="menu.jsp">
            <jsp:param name="item" value="ofertas" />
        </jsp:include>

       <jsp:useBean id="Produtos" class="modelos.Produto"/>


        <%
           String init = request.getParameter("inicio");
           int inicio = init!=null? Integer.parseInt(init):0;

           String end = request.getParameter("fim");
           int fim = end!=null? Integer.parseInt(end):6;
        %>


        <div class="container">


            <div class="ofertas">
                <h1>Ofertas da Loja!</h1>

               <%  for(int i=inicio; i<fim; i++){ %>
                  <% if( i < Produto.lista.size()) { %>
                     <% Produto p = Produto.lista.get(i); %>
                     <% if(p.getOferta()){ %>
                     <div>
                     <%    
                      out.println("<h5> <a href=\"produto.jsp?id="+i+ "\">"+ Produto.lista.get(i).getDescricao()+" </a></h5> ");
                      %>  
                      <p> R$ <%=p.getPreco()%> </p>
                      <img src="<%=p.getImagem()%>"> </img>
                             
                      </div>
                     <% } %>
                  <% } %>
               <%}%>

            <nav aria-label="index.jsp">
            <ul class="pagination">

                <li class="page-item"><a class="page-link" href="?inicio=0&fim=6">1</a></li>
             <li class="page-item"><a class="page-link" href="?inicio=6&fim=13">2</a></li>

            </ul>
        </nav>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
