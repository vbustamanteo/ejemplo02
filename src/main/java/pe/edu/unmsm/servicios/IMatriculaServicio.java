package pe.edu.unmsm.servicios;

import java.util.List;

import pe.edu.unmsm.entidades.Matricula;

public interface IMatriculaServicio {
	public List<Matricula> findAll();
	public Matricula findById(Integer id, Integer matricula);
}
