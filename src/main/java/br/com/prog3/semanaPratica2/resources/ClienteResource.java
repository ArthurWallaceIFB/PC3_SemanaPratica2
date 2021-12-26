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

import br.com.prog3.semanaPratica2.domain.Cliente;
import br.com.prog3.semanaPratica2.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteResource {
	@Autowired
	private ClienteService clienteService;

	@PostMapping
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}

	@GetMapping
	public List<Cliente> findAll() {
		return clienteService.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Cliente> findById(@PathVariable("id") Long id) {
		return clienteService.findById(id);
	}

	@PutMapping(value = "/{id}")
	public Cliente update(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
		Optional<Cliente> optional = clienteService.findById(id);
		if (optional.isPresent()) {
			Cliente c = optional.get();
			c.setCpf(cliente.getCpf());
			c.setNome(cliente.getNome());
			c.setDataNascimento(cliente.getDataNascimento());
			c.setCarros(cliente.getCarros());
			clienteService.update(c);
			return c;
		} else {
			throw new RuntimeException("Não foi possível alterar registro");
		}
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") Long id) {
		clienteService.deleteById(id);
	}
}
