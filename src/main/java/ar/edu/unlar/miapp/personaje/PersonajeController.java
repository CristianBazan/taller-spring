package ar.edu.unlar.miapp.personaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonajeController {

	@Autowired
	private PersonajeService personajeService;

	@GetMapping("/")
	public String listar(Model model) {
		model.addAttribute("personajes", personajeService.buscarTodos());
		return "list";
	}

	@GetMapping("/nuevo")
	public String crear(Model model) {
		model.addAttribute("personaje", new Personaje());
		return "form";
	}

	@GetMapping("/editar/{id}")
	public String crear(@PathVariable Long id, Model model) {
		model.addAttribute("personaje", personajeService.buscarPorId(id));
		return "form";
	}

	@PostMapping("guardar")
	public String guardar(Personaje personaje) {
		personajeService.guardarPersonaje(personaje);
		return "redirect:/";
	}

	@GetMapping("/borrar/{id}")
	public String eliminar(@PathVariable Long id) {
		personajeService.borrarPersonaje(id);
		return "redirect:/";
	}

}
