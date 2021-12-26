package br.com.prog3.semanaPratica2.repository;

import java.util.List;

import br.com.prog3.semanaPratica2.domain.Oficina;
import br.com.prog3.semanaPratica2.domain.Carro;

public interface IOficinaRepository {
	List<Oficina> findAll();
	Oficina findByCodigo(Integer codigo);
	List<Oficina> findByCarro(Carro carro);
	Oficina inserir(Oficina oficina);
	Oficina alterar(Oficina oficina);
	void excluir(Integer codigo);
}
