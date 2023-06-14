package br.com.ml.pagemensagespringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ml.pagemensagespringboot.model.dto.PageDto;
import br.com.ml.pagemensagespringboot.model.dto.PageInserirDto;
import br.com.ml.pagemensagespringboot.model.entidades.Page;
import br.com.ml.pagemensagespringboot.repository.PageRepository;
import lombok.Getter;

@Service
public class PageService {
    
    @Autowired @Getter
    private PageRepository repository;

    public PageDto salvar( PageInserirDto pageDto){
        return page2PageDtoBuilder(
        getRepository()
        .save(
            dto2PageBuilder(pageDto))
            );

    }
    public Page dto2PageBuilder(PageInserirDto pageInserirDto){
         return Page.builder()
            .nome(pageInserirDto.getNome())
            .email(pageInserirDto.getEmail())
            .assunto(pageInserirDto.getAssunto())
            .mensagem(pageInserirDto.getMensagem())
            .build();
        
    }
   
    public PageDto page2PageDtoBuilder(Page page){
        return PageDto.builder()
          .id(page.getId())
          .nome(page.getNome())
          .email(page.getEmail())
          .assunto(page.getAssunto())
          .mensagem(page.getMensagem())
          .build();
    }
}    
