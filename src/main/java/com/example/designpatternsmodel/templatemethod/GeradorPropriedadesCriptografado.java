package com.example.designpatternsmodel.templatemethod;

import java.io.IOException;
import java.util.Map;

/*
* o método gerarConteudo() cria a estrutura de um
arquivo de propriedades em que cada linha possui o formato propriedade=valor. O
método de processamento criptografa os bytes do arquivo utilizando um algoritmo
simples chamado cifra de César, em que o valor de cada byte é deslocado de acordo
com o parâmetro delay
* */
public class GeradorPropriedadesCriptografado extends GeradorArquivo {

    private int delay;

    public GeradorPropriedadesCriptografado(int delay) {
        this.delay = delay;
    }

    protected byte[] processar(byte[] bytes) throws IOException {
        byte[] newBytes = new byte[bytes.length];
        for(int i=0;i<bytes.length;i++){
            newBytes[i]= (byte) ((bytes[i]+delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        for(String propriedade : propriedades.keySet()){
            propFileBuilder.append(propriedade+"="+propriedades.get(propriedade)+"\n");
        }
        return propFileBuilder.toString();
    }

}
