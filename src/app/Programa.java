package app;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DAOFabrica;
import model.dao.DepartamentoDAO;
import model.entities.Departamento;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartamentoDAO departamentoDAO = DAOFabrica.createDepartamentoDAO();
		
		System.out.println("=== TESTE 1: FindById ===");
		Departamento departamento = departamentoDAO.findByID(1);
		System.out.println(departamento);
		
		
		System.out.println("=== TESTE 2: FindAll ===");
		List<Departamento> lista = departamentoDAO.findAll();
		for(Departamento d : lista) {
			System.out.println(d);
		}
			
		System.out.println("=== TESTE 3: Insert ===");
		Departamento newVendedor =  new Departamento(null, "Music");
		departamentoDAO.insert(newVendedor);
		System.out.println("Inserted! new id = " + newVendedor.getId());
		
		System.out.println("=== TESTE 4: Update ===");
		departamento = departamentoDAO.findByID(1);
		departamento.setNome("Martha Waine");
		departamentoDAO.update(departamento);
		System.out.println("Update completed");
		
		System.out.println("=== TESTE 5: Delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departamentoDAO.deleteByID(id);
		System.out.println("Delete completed!");
		sc.close();
		
		
		}

	

}
