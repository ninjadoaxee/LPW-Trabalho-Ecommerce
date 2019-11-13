<%--
    Document   : carrinho
    Created on : 06/11/2019, 17:52:35
    Author     : Desenvolvimento
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrinho</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">

   </head>
   <body>
       <jsp:include page="menu.jsp">
            <jsp:param name="item" value="carrinho" />
        </jsp:include>

      <%
         boolean logado = false;

         if(session != null &&
                 session.getAttribute("logado") != null){
             logado = (boolean)session.getAttribute("logado");
         }

         out.print(logado);

         if( !logado ){
              out.print("Você Não está Logado !");
          }else{
               out.print("Você está Logado !");
         }
            %>
   </body>
</html>
