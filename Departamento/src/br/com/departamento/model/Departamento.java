package br.com.departamento.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Departamento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
private String nome;
@OneToMany(mappedBy="departamento",fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
private List<Empregado>empregados;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public List<Empregado> getEmpregados() {
	return empregados;
}
public void setEmpregados(List<Empregado> empregados) {
	this.empregados = empregados;
}

}


