package model.dao;

import java.util.List;

import model.entities.Departamento;
import model.entities.Vendedor;

public interface VendedorDAO {
	
	
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteByID(Integer id);
	Vendedor findByID(Integer id);
	List<Vendedor> findAll();
	List<Vendedor> findByDepartament(Departamento departamento);

}
