package net.gjimenez.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.gjimenez.com.models.entity.Categoria;
import net.gjimenez.com.models.services.ICategoriaService;

@RestController
@RequestMapping(value="/api")
public class CategoriasRestController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@GetMapping("/listar")
	public List<Categoria> listCategorias(){
		return categoriaService.listAllCategoria();
	}
	
	
}
