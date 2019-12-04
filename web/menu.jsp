<%--
    Document   : menu
    Created on : 18/09/2019, 16:13:27
    Author     : gutol
--%>
<%@page import="db.Mock"%>
<%
    //Populando dados para teste
    Mock.makeMock();

    String item = request.getParameter("item");
    String active = "class=\"active\"";

    String c_ofertas = item.equals("ofertas")? active : "";
    String c_produtos = item.equals("produtos")? active : "";
    String c_sobre = item.equals("sobre")? active : "";
    String c_carrinho = item.equals("carrinho")? active : "";
    
    boolean logado = false;
    if(session != null &&
        session.getAttribute("logado") != null){
            logado = (boolean)session.getAttribute("logado");
        }
%>

<nav class="navbar navbar-inverse">
   <div class="container-fluid">
     <div class="navbar-header">
       <a class="navbar-brand" href="index.jsp">E-Prendedores</a>
     </div>
     <ul class="nav navbar-nav">
         <li <%=c_ofertas%> ><a href="index.jsp">Ofertas</a></li>
         <li <%=c_produtos%> ><a href="produtos.jsp">Produtos</a></li>
         <li <%=c_sobre%> ><a href="sobre.jsp">Sobre</a></li>
     </ul>

     <ul class="nav navbar-nav navbar-right">
       <li <%=c_carrinho%> > <a href="carrinho.jsp"> <span class="glyphicon glyphicon-shopping-cart"></span> </a> </li>
        <%        
                if(logado == false){
        %>
       <li><a href="login.jsp">Entrar</a></li>
       <% } else { %>
       <li><a href="index.jsp">Logado!</a></li>
       <% } %>
     </ul>
   </div>
 </nav>
