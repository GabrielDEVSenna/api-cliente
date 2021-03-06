package br.com.gabrieldevsena.cliente.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDTO {

    private String nome;
    private String email;
    private String cpf;
    private String ddd;
    private String telefone;
    private EnderecoDTO endereco;

}
