package pe.edu.unmsm.clientes;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pe.edu.unmsm.entidades.Alumno;

@FeignClient(name="ejemplo01")
public interface AlumnoClienteRest {
	@GetMapping("/todos")
	public List<Alumno> listar();
	@GetMapping("/ver/{id}")
	public Alumno ver(@PathVariable Integer id); 
}
