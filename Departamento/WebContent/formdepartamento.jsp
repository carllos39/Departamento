<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 
<title>Departamento</title>
</head>
<body>
<form action="DepartamentoController" method="post" class="row g-3">
<fieldset>
<legend>Departamento</legend>
<p>
<label class="form-label">Atualizar departamento</label>
<input name="id">
</p>
<p>
<div class="col-md-6">
<label class="form-label">Nome departamento</label>
<input class="form-control" name="nome">
</div>
</p>
<input type="submit" value="Cadastrar"class="btn btn-dark">
<input type="reset" value="Limpar"class="btn btn-dark">
<a href="formempregado.jsp"class="btn btn-dark">Formulário empregado</a>
</fieldset>
<br>
<a href="DepartamentoController"class="btn btn-dark">Lista departamento</a>
<table class="table" >
<tr>
<th>Id</th>
<th>Nome</th>
<th>Ação</th>
</tr>
<c:forEach items="${lista}" var="departamento">
<tr>
<td>${departamento.id}</td>
<td>${departamento.nome}</td>
<td><a href="removerDepartamento?id=${departamento.id}">Remover</a></td>
</tr>
</c:forEach>
</table>
</form>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>