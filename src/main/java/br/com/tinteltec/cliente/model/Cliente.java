package br.com.tinteltec.cliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private String email;
    private String cpf;
    private String ddd;
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "endereco_ID")
    private Endereco endereco;

}
