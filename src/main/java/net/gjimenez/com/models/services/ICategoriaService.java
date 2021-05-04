package net.gjimenez.com.models.services;

import java.util.List;

import net.gjimenez.com.models.entity.Categoria;

public interface ICategoriaService {
	
	public List<Categoria> listAllCategoria();
	
	public Categoria findById();
	
	public void saveCategoria();

}
