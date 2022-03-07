package com.example.designpatternsmodel.nullobject;

import javax.servlet.ServletRequest;

public class CookieFactory {

    public static Carrinho criarCarrinho(ServletRequest request) {

        if (request.getAttribute("valor") != null && request.getAttribute("qtd") != null && request.getAttribute("username") != null)
        {

            CarrinhoNovo carrinho = new CarrinhoNovo();
            carrinho.setValor((Double) request.getAttribute("valor"));
            carrinho.setTamanho((Integer) request.getAttribute("qtd"));
            carrinho.setNomeUsuario((String) request.getAttribute("username"));

            return carrinho;
        } else {
            return new CarrinhoNulo();
        }

    }

}
