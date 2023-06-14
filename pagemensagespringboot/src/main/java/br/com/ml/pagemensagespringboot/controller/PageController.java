package br.com.ml.pagemensagespringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ml.pagemensagespringboot.model.dto.PageInserirDto;
import br.com.ml.pagemensagespringboot.service.PageService;
import jakarta.validation.Valid;
import lombok.Getter;

@Controller
@RequestMapping("/pages")
public class PageController {

    @Autowired @Getter
    private PageService service;

    @GetMapping("/new-page")
    public String loadFormulario(Model model){
        model.addAttribute("page", new PageInserirDto());
        return "form-page";


    }
    @PostMapping
    public String salvar( @ModelAttribute("page") @Valid PageInserirDto page, Errors errors) throws Exception{
        
        getService().salvar(page);
        return "form-page";
    }
   


}
