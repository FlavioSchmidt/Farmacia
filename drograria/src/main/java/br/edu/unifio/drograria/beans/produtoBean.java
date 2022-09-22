package br.edu.unifio.drograria.beans;

import br.edu.unifio.drograria.entidades.Categoria;
import br.edu.unifio.drograria.entidades.Produto;
import br.edu.unifio.drograria.repository.ProdutoRepository;
import br.edu.unifio.drograria.repository.categoriaRepository;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Component
@ViewScoped
@Data
public class produtoBean {
    @Getter @Setter
    private List<Categoria> categorias;

    private List<Produto> produtos;

    @Autowired
    private categoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;
    public void listar(){
        produtos = produtoRepository.findAll();
    }

}