package br.edu.unifio.drograria.entidades;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity


public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(length = 100, nullable = false, unique = true)
    private String nome;

    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private Short quantidade;

    @Column()
    private LocalDate validade;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Categoria categoriaFk;
}
