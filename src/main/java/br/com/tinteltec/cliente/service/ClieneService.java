package br.com.tinteltec.cliente.service;

import br.com.tinteltec.cliente.dto.ClienteDTO;

import java.util.List;

public interface ClieneService {

    public List<ClienteDTO> listar();

    public ClienteDTO criar(ClienteDTO clienteDTO);

    public void atualizar(ClienteDTO cliente, Long id);

    public void delet(Long id);

}
