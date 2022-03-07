package com.example.designpatternsmodel.templatemethod;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/*
* implementação, no método
gerarConteudo() cria um arquivo XML no qual existe uma tag chamada
<properties> e cada propriedade é um elemento dentro dessa tag. O método
processar() usa a classe ZipOutputStream para gerar um arquivo compactado
* */
public class GeradorXMLCompactado extends GeradorArquivo {

    protected byte[] processar(byte[] bytes) throws IOException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ZipOutputStream out = new ZipOutputStream(byteOut);
        out.putNextEntry(new ZipEntry("internal"));
        out.write(bytes);
        out.closeEntry();
        out.close();
        return byteOut.toByteArray();
    }

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();

        propFileBuilder.append("<properties>");
        for(String propriedade : propriedades.keySet()){
            propFileBuilder.append("<"+propriedade+">"+propriedades.get(propriedade)+"</"+propriedade+">");
        }
        propFileBuilder.append("</properties>");

        return propFileBuilder.toString();
    }

}
