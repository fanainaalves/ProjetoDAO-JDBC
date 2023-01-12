package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Departamento implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	public Departamento() {
	}
	
	public Departamento(Integer id, String nome) {
		this.id = id;
		this.name = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + name + "]";
	}
}
