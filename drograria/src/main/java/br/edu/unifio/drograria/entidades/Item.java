package br.edu.unifio.drograria.entidades;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;


    @Column(nullable = false)
    private Byte quantidade;

    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;


}
