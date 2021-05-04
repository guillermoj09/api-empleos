package net.gjimenez.com.models.services;

import java.util.List;

import net.gjimenez.com.models.entity.Vacante;

public interface IVacanteService {
	
	public List<Vacante> findAllVacante();
	
	public Vacante findByIdCategoria();
	
	public void saveVacante();

}
