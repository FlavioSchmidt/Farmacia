package br.edu.unifio.drograria.repository;

import br.edu.unifio.drograria.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository <Produto, Integer> {

}