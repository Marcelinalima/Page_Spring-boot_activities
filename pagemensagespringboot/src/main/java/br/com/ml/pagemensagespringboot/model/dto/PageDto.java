package br.com.ml.pagemensagespringboot.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PageDto  {

    private Long id;

    private String nome;

    private String  email;

   
    private String assunto;


    private String mensagem;

    
}