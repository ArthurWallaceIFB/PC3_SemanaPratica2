package br.com.prog3.semanaPratica2.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.semanaPratica2.domain.Carro;
import br.com.prog3.semanaPratica2.service.CarroService;

@RestController
@RequestMapping("/api/v1/carros")
public class CarroResource {
	@Autowired
	private CarroService carroService;

	@PostMapping
	public Carro save(@RequestBody Carro carro) {
		return carroService.save(carro);
	}

	@GetMapping
	public List<Carro> findAll() {
		return carroService.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Carro> findById(@PathVariable("id") Long id) {
		return carroService.findById(id);
	}

	@PutMapping(value = "/{id}")
	public Carro update(@PathVariable("id") Long id, @RequestBody Carro carro) {
		Optional<Carro> optional = carroService.findById(id);
		if (optional.isPresent()) {
			Carro c = optional.get();
			c.setPlaca(carro.getPlaca());
			c.setCor(carro.getCor());
			c.setAno(carro.getAno());
			c.setAnoModelo(carro.getAnoModelo());
			c.setMarca(carro.getMarca());
			c.setModelo(carro.getModelo());
			c.setCliente(carro.getCliente());
			c.setOficina(carro.getOficina());
			carroService.update(c);
			return c;
		} else {
			throw new RuntimeException("Não foi possível alterar registro");
		}
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") Long id) {
		carroService.deleteById(id);
	}
}
