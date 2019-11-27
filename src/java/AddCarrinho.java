/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.Item;
import modelos.Produto;

/**
 *
 * @author Desenvolvimento
 */
public class AddCarrinho extends HttpServlet {


   /**
    * Handles the HTTP <code>POST</code> method.
    *
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error occurs
    * @throws IOException if an I/O error occurs
    */
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

      int id = Integer.parseInt(request.getParameter("id"));
      int quantidade = Integer.parseInt(request.getParameter("quantidade"));

      //Busco as informações do produto que eu quero
      //As inforamações estão em Produto.lista
      Produto teste = Produto.lista.get(id);
      Item p = new Item(teste, quantidade);

      HttpSession session = request.getSession();

      ArrayList<Item> carrinho;
      //Se o carrinho vazio
      if(session.getAttribute("carrinho")==null){
         carrinho = new ArrayList();
      }else{
         carrinho = (ArrayList<Item>)session.getAttribute("carrinho");
      }

      carrinho.add(p);
      session.setAttribute("carrinho", carrinho);

      response.sendRedirect("carrinho.jsp");

   }

   /**
    * Returns a short description of the servlet.
    *
    * @return a String containing servlet description
    */
   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>

}
