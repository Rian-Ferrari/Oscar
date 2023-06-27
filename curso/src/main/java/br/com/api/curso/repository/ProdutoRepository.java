package br.com.api.curso.repository;

import br.com.api.curso.model.ProdutoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<ProdutoModel, Long> {

}
