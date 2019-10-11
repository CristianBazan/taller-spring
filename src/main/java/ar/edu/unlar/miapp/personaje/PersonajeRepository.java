package ar.edu.unlar.miapp.personaje;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

	List<Personaje> findByNombreContaining(String texto);
	
	
	// Para hacer consultas a la BD ver la siguiente documentacion de Spring Data JPA:
	// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
}
