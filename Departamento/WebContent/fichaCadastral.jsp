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
 
<title>FichaCadastral</title>
</head>
<body>
<form action="SelecionarFicha" method="post" class="row  g-3">
<fieldset>
<legend>Fixa Cadastral</legend>
<p>
<input type="text" value="${empregado.eid}" name="eid">
</p>
<p>
<div class="col-md-6">
<label class="form-label">Nome</label>
<input class="form-control" type="text" value="${empregado.nome}" name="nome">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">Rua</label>
<input class="form-control" type="text" name="rua">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">Número</label>
<input class="form-control" type="text" name="numero">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">Bairro</label>
<input class="form-control" type="text" name="bairro">
</div>
</p>
<div class="col-md-6">
<label class="form-label">Cidade</label>
<input class="form-control" type="text" name="cidade">
</div>
<p>
<div class="col-md-6">
<label class="form-label">Estado</label>
<input class="form-control" type="text" name="estado">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">Pais</label>
<input class="form-control" type="text" name="pais">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">telefone</label>
<input class="form-control" type="text" name="telefone">
</div>
</p>
<p>
<div class="col-md-6">
<label class="form-label">Email</label>
<input class="form-control" type="text" name="email">
</div>
</p>
<p>
<input type="submit" value="Cadastrar" class="btn btn-dark">
<a href="formdepartamento.jsp" class="btn btn-dark">Formulário departamento</a>
<a href="formempregado.jsp"class="btn btn-dark">Formulário empregado</a>
</p>
</fieldset>
</form>
<a href="ListaFicha" class="btn btn-dark">Lista de endereços</a>
<table class="table">
<tr>
<th>Fid</th>
<th>Nome</th>
<th>Rua</th>
<th>Número</th>
<th>Bairro</th>
<th>Municipio</th>
<th>Estado</th>
<th>Pais</th>
<th>Telefone</th>
<th>Email</th>
<th>Empregado</th>
<th>Ação</th>
</tr>
<c:forEach items="${ficha}" var="fichaCadastral">
<tr>
<td>${fichaCadastral.fid}</td>
<td>${fichaCadastral.nome}</td>
<td>${fichaCadastral.rua}</td>
<td>${fichaCadastral.numero}</td>
<td>${fichaCadastral.bairro}</td>
<td>${fichaCadastral.cidade}</td>
<td>${fichaCadastral.estado}</td>
<td>${fichaCadastral.pais}</td>
<td>${fichaCadastral.telefone}</td>
<td>${fichaCadastral.email}</td>
<td>${fichaCadastral.empregado.eid}</td>
<td><a href="RemoverFicha?fid=${fichaCadastral.fid}">Remover</a></td>
</tr>
</c:forEach>
</table>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>