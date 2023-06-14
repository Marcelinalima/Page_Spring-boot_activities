package br.com.ml.pagemensagespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ml.pagemensagespringboot.model.entidades.Page;

public interface PageRepository extends JpaRepository<Page, Long>{

    Page findByIdAndNome(Long id, String nome);

    
}