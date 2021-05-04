package net.gjimenez.com.models.dao;

import org.springframework.data.repository.CrudRepository;

import net.gjimenez.com.models.entity.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long> {

}
