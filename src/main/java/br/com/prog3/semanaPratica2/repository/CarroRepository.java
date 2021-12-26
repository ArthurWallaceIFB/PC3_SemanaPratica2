package br.com.prog3.semanaPratica2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.prog3.semanaPratica2.domain.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Long>{
}