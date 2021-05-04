package net.gjimenez.com.models.dao;

import org.springframework.data.repository.CrudRepository;

import net.gjimenez.com.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
