<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
 
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 
<title>Empregado</title>
</head>
<body>
<form action="EmpregadoController" method="post" class="row g-3">
<fieldset>
<legend>Empregado</legend>
<p>
<input type="hidden" value="${fichaCadastral.fid}" name="fid">
</p>
<p>
<div class="col-md-6">
<label class="form-label">Atualizar empregado</label>
<input class="form-control" name="eid">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">Nome</label>
<input class="form-control" name="nome">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">Salário</label>
<input class="form-control" name="salario">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">Cargo</label>
<input class="form-control" name="cargo">
</div>
</p>
<a href="EmpregadoController" class="btn btn-dark">Carregar departamento</a>
<select name="id">
<c:forEach items="${lista}" var="departamento">
<option value="${departamento.id}">${departamento.nome}</option>
</c:forEach>
</select>
<input type="submit" value="Cadastrar" class="btn btn-dark">
<input type="reset" value="Limpar" class="btn btn-dark">
<a href="formdepartamento.jsp" class="btn btn-dark">Formulário departamento</a>
</fieldset>
</form>
<br>
<a href="ListaEmpregado" class="btn btn-dark">Lista empregado</a>
<table class="table">
<tr>
<th>Eid</th>
<th>Nome</th>
<th>Salário</th>
<th>Cargo</th>
<th>departamento</th>
<th>ação</th>
<th>ação</th>
<tr>
</tr>
<c:forEach items="${listaEmpregado}" var="empregado">
<tr>
<td>${empregado.eid}</td>
<td>${empregado.nome}</td>
<td>${empregado.salario}</td>
<td>${empregado.cargo}</td>
<td>${empregado.departamento.id}</td>
<td><a href="RemoverEmpregado?eid=${empregado.eid}">remover</a></td>
<td><a href="SelecionarFicha?eid=${empregado.eid}">Ficha Cadastral</a></td>
</tr>
</c:forEach>
</table>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>