package br.com.prog3.semanaPratica2.repository;

import java.util.List;

import br.com.prog3.semanaPratica2.domain.Carro;

public interface ICarroRepository {
	List<Carro> findAll();
	Carro findById(Long id);
	Carro inserir(Carro carro);
	Carro alterar(Carro carro);
	void excluir(String placa);
}
