package br.com.departamento.model;





import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Empregado {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer eid;
private String nome;
private Double salario;
private String cargo;
@ManyToOne(fetch=FetchType.LAZY)
private Departamento departamento;
@OneToOne(mappedBy="empregado") 
private FichaCadastral fichaCadastral;
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Double getSalario() {
	return salario;
}
public void setSalario(Double salario) {
	this.salario = salario;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public Departamento getDepartamento() {
	return departamento;
}
public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}
public FichaCadastral getFichaCadastral() {
	return fichaCadastral;
}
public void setFichaCadastral(FichaCadastral fichaCadastral) {
	this.fichaCadastral = fichaCadastral;
}

}
