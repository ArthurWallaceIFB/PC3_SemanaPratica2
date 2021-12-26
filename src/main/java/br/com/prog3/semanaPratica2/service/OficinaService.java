package br.com.prog3.semanaPratica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.semanaPratica2.domain.Oficina;
import br.com.prog3.semanaPratica2.repository.OficinaRepository;

@Service
public class OficinaService {
	@Autowired
	private OficinaRepository oficinaRepository;

	public Oficina save(Oficina oficina) {
		return oficinaRepository.save(oficina);
	}

	public List<Oficina> findAll() {
		return (List<Oficina>) oficinaRepository.findAll();
	}

	public Optional<Oficina> findById(Long id) {
		return oficinaRepository.findById(id);
	}

	public Oficina update(Oficina oficina) {
		return oficinaRepository.save(oficina);
	}

	public void deleteById(Long id) {
		oficinaRepository.deleteById(id);
	}

}