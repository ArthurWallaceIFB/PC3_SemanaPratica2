package br.com.prog3.semanaPratica2.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.semanaPratica2.domain.Curso;
import br.com.prog3.semanaPratica2.service.CursoService;

@RestController
@RequestMapping("/api/v1/cursos")
public class CursoResource {
	@Autowired
	private CursoService cursoService;

	@PostMapping
	public Curso save(@RequestBody Curso curso) {
		return cursoService.save(curso);
	}

	@GetMapping
	public List<Curso> findAll() {
		return cursoService.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Curso> findById(@PathVariable("id") Long id) {
		return cursoService.findById(id);
	}

	@PutMapping(value = "/{id}")
	public Curso update(@PathVariable("id") Long id, @RequestBody Curso curso) {
		Optional<Curso> optional = cursoService.findById(id);
		if (optional.isPresent()) {
			Curso c = optional.get();
			c.setCargaHoraria(curso.getCargaHoraria());
			c.setNome(curso.getNome());
			c.setModalidade(curso.getModalidade());
			cursoService.update(c);
			return c;
		} else {
			throw new RuntimeException("Não foi possível alterar registro");
		}
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") Long id) {
		cursoService.deleteById(id);
	}
}
