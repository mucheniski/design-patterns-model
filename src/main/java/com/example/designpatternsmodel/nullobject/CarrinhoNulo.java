package com.example.designpatternsmodel.nullobject;

public class CarrinhoNulo extends Carrinho{

    public Double getValor() {
        return 0.0;
    }

    public Integer getTamanho() {
        return 0;
    }

    public String getNomeUsuario() {
        return "retornar para a página de login";
    }

}
