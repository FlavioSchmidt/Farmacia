package br.edu.unifio.drograria.repository;

import br.edu.unifio.drograria.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoriaRepository extends JpaRepository<Categoria,Short> {

}
