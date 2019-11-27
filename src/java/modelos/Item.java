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

   public Item(Produto a, int quantidade){
      super();
      
      this.quantidade = quantidade;
      this.setDescricao(a.getDescricao());
      this.setPreco(a.getPreco());
      this.setOferta(a.getOferta());
      this.setImagem(a.getImagem());
   }

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
