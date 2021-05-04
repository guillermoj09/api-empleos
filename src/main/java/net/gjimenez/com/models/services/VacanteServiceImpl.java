package net.gjimenez.com.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.gjimenez.com.models.dao.IVacanteDao;
import net.gjimenez.com.models.entity.Vacante;

@Service
public class VacanteServiceImpl implements IVacanteService {
	
	@Autowired
	private IVacanteDao vacanteDao;

	@Override
	public List<Vacante> findAllVacante() {
		return (List<Vacante>) vacanteDao.findAll();
		
	}

	@Override
	public Vacante findByIdCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveVacante() {
		// TODO Auto-generated method stub
		
	}

}
