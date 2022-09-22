package br.edu.unifio.drograria.beans;

import br.edu.unifio.drograria.entidades.Categoria;
import br.edu.unifio.drograria.repository.categoriaRepository;
import lombok.Data;

import org.omnifaces.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Component
@ViewScoped
@Data

public class categoriaBean {

    private Categoria categoria;
    private List<Categoria> categorias;
    @Autowired
    private categoriaRepository categoriaRepository ;
    public void Listar(){
        categorias=categoriaRepository.findAll();
    }
  public void Novo(){
        categoria = new Categoria();
  }
  public void Salvar(){
        try{
        categoriaRepository.save(categoria);
            Messages.addFlashGlobalInfo("Salvo com Sucesso");

        }catch (DataIntegrityViolationException ex){
            ex.printStackTrace();
            Messages.addFlashGlobalInfo("Registro já existente");

        }

  }
}
