package com.api.register.dao;

import com.api.register.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Long> {
}
