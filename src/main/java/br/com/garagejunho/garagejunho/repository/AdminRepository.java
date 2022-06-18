package br.com.garagejunho.garagejunho.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.garagejunho.garagejunho.model.Administrador;

public interface AdminRepository extends CrudRepository<Administrador, Integer>{
    
}
