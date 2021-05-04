package net.gjimenez.com.models.dao;

import org.springframework.data.repository.CrudRepository;

import net.gjimenez.com.models.entity.Vacante;

public interface IVacanteDao extends CrudRepository<Vacante, Long > {

}
