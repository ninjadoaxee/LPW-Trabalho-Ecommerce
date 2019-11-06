/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Desenvolvimento
 */
public class Item extends Produto {
   private int quantidade;

   public Item(){
      super();
   }

   public int getQuantidade() {
      return quantidade;
   }

   public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }

}
