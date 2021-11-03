package br.com.gabrieldevsena.cliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String referencia;

}