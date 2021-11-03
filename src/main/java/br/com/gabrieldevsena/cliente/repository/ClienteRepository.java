package br.com.gabrieldevsena.cliente.repository;

import br.com.gabrieldevsena.cliente.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
