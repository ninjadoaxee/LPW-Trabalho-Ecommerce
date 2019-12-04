/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;
import modelos.Usuario;

/**
 *
 * @author gutol
 */
public class Mock {


    public static void makeMock(){
        createUsers();
        createProducts();
    }

    private static void createUsers(){
        ArrayList<Usuario> lista;

        if(Usuario.getLista().isEmpty()){
            lista = Usuario.getLista();

            Usuario admin = new Usuario();
            admin.setEmail("admin@ifpr.edu.br");
            admin.setSenha("admin");
            admin.setNome("Administrador");
            lista.add(admin);

            Usuario gerente = new Usuario();
            gerente.setEmail("gerente@ifpr.edu.br");
            gerente.setSenha("123");
            gerente.setNome("Fulano de Tal");
            lista.add(gerente);
        }

    }

    private static void createProducts(){
        ArrayList<Produto> lista;

        //só cria produtos com lista vazia
        if(Produto.lista.isEmpty()){
            lista = Produto.lista;

            Produto pregador = new Produto();
            pregador.setDescricao("Pregador de Madeira - Rústico Clássico Gourmet");
            pregador.setPreco(5.75f);
            pregador.setOferta(true);
            pregador.setImagem("https://http2.mlstatic.com/prendedor-de-roupa-madeira-sol-de-vero-kit-72-unidades-D_NQ_NP_765344-MLB28122713989_092018-F.jpg");
            lista.add(pregador);

            Produto pregador1 = new Produto();
            pregador1.setDescricao("Kit com 10 pregadores de madeira clássicos gourmet.");
            pregador1.setPreco(50f);
            pregador1.setOferta(true);
            pregador1.setImagem("https://http2.mlstatic.com/prendedores-pregador-de-roupa-madeira-artesanato-60-unidades-D_NQ_NP_683948-MLB26837487049_022018-F.jpg");
            lista.add(pregador1);

            Produto pregador2 = new Produto();
            pregador2.setDescricao("Pregadores Gourmet Floridos kit com 2 unidades.");
            pregador2.setPreco(75.99f);
            pregador2.setOferta(true);
            pregador2.setImagem("https://lojamor.vteximg.com.br/arquivos/ids/159802-400-400/006064-Prendedor-Roupa-Lovely-12pcs-Roxo-1.jpg");
            lista.add(pregador2);

            Produto pregador3 = new Produto();
            pregador3.setDescricao("Pregador do exército - Pague 1 leve 2");
            pregador3.setPreco(25.0f);
            pregador3.setOferta(true);
            pregador3.setImagem("https://cdn.leroymerlin.com.br/products/pregador_roupa_12_un_86615991_268e_300x300.jpg");
            lista.add(pregador3);

            Produto pregador4 = new Produto();
            pregador4.setDescricao("Pregador Morangos do Campo");
            pregador4.setPreco(47.90f);
            pregador4.setOferta(true);
            pregador4.setImagem("https://www.brindesdemais.com.br/fotos/produtos/zoom/2633/Prendedor-de-embalagem-PDD.jpg");
            lista.add(pregador4);

            Produto pregador5 = new Produto();
            pregador5.setDescricao("Kit com 6 pregadores coloridos - Edição Deluxe.");
            pregador5.setPreco(120f);
            pregador5.setOferta(true);
            pregador5.setImagem("http://d1a87ut6isnmlv.cloudfront.net/thumb-img//m-MaG-KAvcIFMeEvdAekr1YtmAQ=/495x914:2582x3273/328x369/produtos/cd/87/P338.jpg");
            lista.add(pregador5);

            Produto pregador6 = new Produto();
            pregador6.setDescricao("Pregador Crimson Web.");
            pregador6.setPreco(350f);
            pregador6.setOferta(true);
            pregador6.setImagem("https://doural.vteximg.com.br/arquivos/ids/177541-1000-1000/0411062-PRENDEDOR-LUXO.jpg");
            lista.add(pregador6);

            Produto pregador7 = new Produto();
            pregador7.setDescricao("Pregador Avião da 2a Guerra Mundial - Edição de Colecionador");
            pregador7.setPreco(1200f);
            pregador7.setOferta(true);
            pregador7.setImagem("https://i.pinimg.com/originals/f3/8f/db/f38fdb12f007d14f634ae02c64a65c41.jpg");
            lista.add(pregador7);

            Produto pregador8 = new Produto();
            pregador8.setDescricao("Peggy o pregador inteligente.");
            pregador8.setPreco(3450f);
            pregador8.setOferta(true);
            pregador8.setImagem("https://img.olhardigital.com.br/uploads/acervo_imagens/2016/04/r16x9/20160420075501_1200_675_-_peggy.jpg");
            lista.add(pregador8);

            Produto pregador9 = new Produto();
            pregador9.setDescricao("Pregador de Roupas Bombril X David Bowie");
            pregador9.setPreco(400f);
            pregador9.setOferta(true);
            pregador9.setImagem("https://www.extra-imagens.com.br/UtilidadesDomesticas/lavanderiaebanheiro/acessoriosdomesticos/5438234/781123425/Kit-de-Prendedores-de-Roupa---Medio-Verde-62x2x5cm-5438234.jpg");
            lista.add(pregador9);

            Produto pregador10 = new Produto();
            pregador10.setDescricao("Pregador Halloween Bat.");
            pregador10.setPreco(37.50f);
            pregador10.setOferta(true);
            pregador10.setImagem("http://i1.wp.com/newserrado.com/wp-content/uploads/2012/09/Vespertilium-clothes-pegs-Art-Lebedev-Studio-Halloween.jpeg");
            lista.add(pregador10);

            Produto pregador11 = new Produto();
            pregador11.setDescricao("Kit 3 Pregadores do Beatles");
            pregador11.setPreco(150f);
            pregador11.setOferta(true);
            pregador11.setImagem("https://thumbs.dreamstime.com/b/grampos-do-pregador-de-roupa-isolados-no-fundo-branco-124046883.jpg");
            lista.add(pregador11);


        }
        
    }

}
