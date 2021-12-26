package br.com.prog3.semanaPratica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.semanaPratica2.domain.Carro;
import br.com.prog3.semanaPratica2.repository.CarroRepository;

@Service
public class CarroService {
	@Autowired
	private CarroRepository carroRepository;

	public Carro save(Carro carro) {
		return carroRepository.save(carro);
	}

	public List<Carro> findAll() {
		return (List<Carro>) carroRepository.findAll();
	}

	public Optional<Carro> findById(Long id) {
		return carroRepository.findById(id);
	}

	public Carro update(Carro carro) {
		return carroRepository.save(carro);
	}

	public void deleteById(Long id) {
		carroRepository.deleteById(id);
	}

}