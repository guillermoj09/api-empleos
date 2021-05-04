package net.gjimenez.com.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.gjimenez.com.models.dao.ICategoriaDao;
import net.gjimenez.com.models.entity.Categoria;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
	
	@Autowired
	private ICategoriaDao categoriaDao;

	@Override
	public List<Categoria> listAllCategoria() {	
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	public Categoria findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCategoria() {
		// TODO Auto-generated method stub
		
	}

}
