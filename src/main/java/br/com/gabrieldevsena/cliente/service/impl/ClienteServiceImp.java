package br.com.gabrieldevsena.cliente.service.impl;

import br.com.gabrieldevsena.cliente.dto.ClienteDTO;
import br.com.gabrieldevsena.cliente.model.Cliente;
import br.com.gabrieldevsena.cliente.repository.ClienteRepository;
import br.com.gabrieldevsena.cliente.service.ClieneService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteServiceImp implements ClieneService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ClienteDTO> listar() {
        List<Cliente> clientes = (List<Cliente>) clienteRepository.findAll();
       return clientes
                .stream()
                .map(cliente -> modelMapper.map(cliente, ClienteDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ClienteDTO criar(ClienteDTO clienteDTO) {

        Cliente cliente = modelMapper.map(clienteDTO, Cliente.class);

        cliente = clienteRepository.save(cliente);

        return modelMapper.map(cliente, ClienteDTO.class);
    }

    @Override
    public void atualizar(ClienteDTO cliente, Long id) {

    }

    @Override
    public void delet(Long id) {

    }
}
