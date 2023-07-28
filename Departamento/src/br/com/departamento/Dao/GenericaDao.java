package br.com.departamento.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.departamento.model.Departamento;
import br.com.departamento.model.Empregado;
import br.com.departamento.model.FichaCadastral;


public class GenericaDao {
public void cadastrar(Departamento departamento){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	em.persist(departamento);
	em.getTransaction().commit();
	em.close();
}
public void alterar(Departamento departamento){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	em.merge(departamento);
	em.getTransaction().commit();
	em.close();
	
}
public void salvar(Departamento departamento){
	if(departamento.getId()==null){
		cadastrar(departamento);
	}else{
		alterar(departamento);
	}
}
public void remover(Departamento departamento){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	departamento=em.find(Departamento.class, departamento.getId());
	em.remove(departamento);
	em.getTransaction().commit();
	em.close();
}
public Departamento selecionaId(Integer id){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	Departamento departamento=em.find(Departamento.class, id);
	em.getTransaction().commit();
	em.close();
	return departamento;
}
public List<Departamento>buscaTodos(){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	Query query=em.createQuery("select c from Departamento c",Departamento.class);
	return query.getResultList();
}
public List<Departamento>buscaNome(String nome){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	Query query=em.createQuery("select c from Departamento c where c.nome like:nome",Departamento.class);
	query.setParameter("nome","%"+nome+"%");
	return query.getResultList();
}
public void cadastrar(Empregado empregado){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	em.persist(empregado);
	em.getTransaction().commit();
	em.close();
}
public void salvarEmpregado(Empregado empregado){
	if(empregado.getEid()==null){
		cadastrar(empregado);
	}else{
		alterar(empregado);
	}
}
public void alterar(Empregado empregado){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	em.merge(empregado);
	em.getTransaction().commit();
	em.close();
}
	public void salvar(Empregado empregado){
		if(empregado.getEid()==null){
			cadastrar(empregado);
		}else{
			alterar(empregado);
		}
	}

public void remover(Empregado empregado){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	empregado=em.find(Empregado.class, empregado.getEid());
	em.remove(empregado);
	em.getTransaction().commit();
	em.close();
}
public Empregado SelecionarEmpregado(Integer eid){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	Empregado empregado=new Empregado();
	em.getTransaction().begin();
	empregado=em.find(Empregado.class, eid);
	em.getTransaction().commit();
	em.close();
	return empregado;
	
}
public List<Empregado>empregados(){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	Query query=em.createQuery("select c from Empregado c",Empregado.class);
	return query.getResultList();
}
public List<Departamento>buscaNomeEmpregados(String nome){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	Query query=em.createQuery("select c from Empregado c where c.nome like:nome",Empregado.class);
	query.setParameter("nome","%"+nome+"%");
	return query.getResultList();
}
public void cadastrarEnderenco(FichaCadastral fichaCadastral){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	em.persist(fichaCadastral);
	em.getTransaction().commit();
	em.close();
}
public FichaCadastral SelecionarId(Integer fid){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	FichaCadastral fichaCadastral=new FichaCadastral();
	em.getTransaction().begin();
	fichaCadastral=em.find(FichaCadastral.class, fid);
	em.getTransaction().commit();
	em.close();
	return fichaCadastral;
	
}
public List<FichaCadastral>ficha(){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	Query query=em.createQuery("select f from FichaCadastral f",FichaCadastral.class);
	return query.getResultList();
}
public void remover(FichaCadastral fichaCadastral){
	EntityManager em=Persistence.createEntityManagerFactory("default").createEntityManager();
	em.getTransaction().begin();
	fichaCadastral=em.find(FichaCadastral.class, fichaCadastral.getFid());
	em.remove(fichaCadastral);
	em.getTransaction().commit();
	em.close();
}

}
