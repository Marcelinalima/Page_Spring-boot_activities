package br.com.ml.pesquisaspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ml.pesquisaspringboot.model.entidades.Page;

public interface PageRepository extends JpaRepository<Page, Long>{

    Page findByIdAndNome(Long id, String nome);

    
}