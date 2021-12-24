package br.com.prog3.semanaPratica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.semanaPratica2.domain.Curso;
import br.com.prog3.semanaPratica2.repository.CursoRepository;

@Service
public class CursoService {
	@Autowired
	private CursoRepository cursoRepository;

	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}

	public List<Curso> findAll() {
		return (List<Curso>) cursoRepository.findAll();
	}

	public Optional<Curso> findById(Long id) {
		return cursoRepository.findById(id);
	}

	public Curso update(Curso curso) {
		return cursoRepository.save(curso);
	}

	public void deleteById(Long id) {
		cursoRepository.deleteById(id);
	}
}