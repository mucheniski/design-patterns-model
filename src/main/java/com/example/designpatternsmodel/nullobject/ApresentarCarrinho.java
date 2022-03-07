package com.example.designpatternsmodel.nullobject;

import javax.servlet.ServletRequest;

public class ApresentarCarrinho {

    public void colocarInformacoesCarrinho(ServletRequest request) {

        Carrinho c = CookieFactory.criarCarrinho(request);

        request.setAttribute("valor", c.getValor());
        request.setAttribute("qtd", c.getTamanho());

        if(request.getAttribute("username") == null) {
            request.setAttribute("userCarrinho", c.getNomeUsuario());
        } else {
            request.setAttribute("userCarrinho",  request.getAttribute("username"));
        }

    }

}
