package pe.edu.unmsm.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import pe.edu.unmsm.clientes.AlumnoClienteRest;
import pe.edu.unmsm.entidades.Alumno;
import pe.edu.unmsm.entidades.Matricula;

@Service("servicioFeign")
@Primary
public class MatriculaServicioFeign implements IMatriculaServicio {

	@Autowired
	private AlumnoClienteRest cliente;

	@Override
	public List<Matricula> findAll() {
		List<Alumno> alumnos = cliente.listar(); 
		List<Matricula> matriculas = new ArrayList<>();
		for( Alumno alumno : alumnos ) {
			Matricula matricula = new Matricula( alumno, 1, "XXX", 2, 3.0);
			matriculas.add(matricula);
		}
		return matriculas;
	}

	@Override
	public Matricula findById(Integer id, Integer matricula) {
		Alumno alumno = cliente.ver(id);
		return new Matricula(alumno, matricula, "YYY", 3, 4.0 );
	}

}
