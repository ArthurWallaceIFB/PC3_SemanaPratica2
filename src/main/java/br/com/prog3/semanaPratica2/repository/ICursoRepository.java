package br.com.prog3.semanaPratica2.repository;

import java.util.List;

import br.com.prog3.semanaPratica2.domain.Curso;
import br.com.prog3.semanaPratica2.enums.Modalidade;

public interface ICursoRepository {
	List<Curso> findAll();
	Curso findById(Long id);
	List<Curso> findByModalidade(Modalidade modalidade);
	Curso inserir(Curso curso);
	Curso alterar(Curso curso);
	void excluir(Long id);
}
