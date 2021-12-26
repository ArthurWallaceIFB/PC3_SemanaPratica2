package br.com.prog3.semanaPratica2.repository;

import java.util.List;

import br.com.prog3.semanaPratica2.domain.Carro;
import br.com.prog3.semanaPratica2.domain.Cliente;

public interface IClienteRepository {
	List<Cliente> findAll();
	Cliente findById(Long id);
	List<Cliente> findByCarro(Carro carro);
	Cliente inserir(Cliente cliente);
	Cliente alterar(Cliente cliente);
	void excluir(String cpf);
}
