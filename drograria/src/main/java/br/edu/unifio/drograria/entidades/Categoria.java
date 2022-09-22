package br.edu.unifio.drograria.entidades;
import lombok.Data;

import javax.persistence.*;

@Entity @Data
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short codigo;

    @Column(length = 50,nullable = false,unique = true)
    private String nome;
}
