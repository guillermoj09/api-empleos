package net.gjimenez.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.gjimenez.com.models.entity.Vacante;
import net.gjimenez.com.models.services.IVacanteService;

@RestController
@RequestMapping(value="/api")
public class VacanteRestController {
	
	@Autowired
	private IVacanteService vacanteService;
	
	@GetMapping(value = "/vacantes")
	public List<Vacante> findAllVacante(){
		return vacanteService.findAllVacante();
	}

}
