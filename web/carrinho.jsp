<%--
    Document   : carrinho
    Created on : 06/11/2019, 17:52:35
    Author     : Desenvolvimento
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelos.Item"%>
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

      <table class="table">
            <thead>
            <tr>
               <th>ITEM</th>
               <th>NOME</th>
               <th>QUANTIDADE</th>
               <th>PREÇO</th>
            </tr>
            </thead>
          <tbody>
             <%


                  ArrayList<Item> carrinho;
                  //Se o carrinho vazio
                  if(session.getAttribute("carrinho")!=null){
                     carrinho = (ArrayList<Item>)session.getAttribute("carrinho");



                        for(int i=0;i<carrinho.size();i++){

                            out.println("<tr>");
                            out.println("<td> "+ (i+1) +" </td>");
                            out.println("<td> "+ carrinho.get(i).getDescricao() +" </td>");
                            out.println("<td> "+ carrinho.get(i).getQuantidade() +" </td>");
                            out.println("<td> "+ ((carrinho.get(i).getPreco())*(carrinho.get(i).getQuantidade())) +" </td>");
                            out.println("</tr>");

                        }


                  }

            %>
          </tbody>


      </table>


   </body>
</html>
