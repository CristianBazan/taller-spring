package ar.edu.unlar.miapp.personaje;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {

	// Inyección de dependencias
	@Autowired
	private PersonajeRepository personajeRepository;

	public List<Personaje> buscarTodos() {
		return personajeRepository.findAll();
	}

	public void guardarPersonaje(Personaje personaje) {
		personajeRepository.save(personaje);
	}

	public void borrarPersonaje(Long id) {
		personajeRepository.deleteById(id);
	}

	public Personaje buscarPorId(Long id) {
		return personajeRepository.findById(id).get();
	}

	public List<Personaje> buscarPorNombreLike(String texto) {
		return personajeRepository.findByNombreContaining(texto);
	}

}
