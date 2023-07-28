package br.com.departamento.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.departamento.model.Departamento;
import br.com.departamento.model.Empregado;

public class TestDepartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
		em.getTransaction().begin();
		Empregado empregado=new Empregado();
		empregado.setNome("Carlos Alexandre");
		empregado.setSalario(3200.00);
		empregado.setCargo("carteiro");
		em.persist(empregado);
		
		List<Empregado>empregados=new ArrayList<Empregado>();
		empregados.add(empregado);
		
		Departamento departamento=new Departamento();
		departamento.setNome("cddButantã");
		departamento.setEmpregados(empregados);
		em.persist(departamento);
		em.getTransaction().commit();
		em.close();

	}

}
