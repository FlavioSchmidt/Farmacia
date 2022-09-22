package br.edu.unifio.drograria.entidades;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @OneToMany(mappedBy = "pedido")
    private List<Item> itens;

    @Column(nullable = false)
    private LocalDateTime horario;

}
