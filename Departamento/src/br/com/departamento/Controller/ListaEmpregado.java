package br.com.departamento.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.departamento.Dao.GenericaDao;
import br.com.departamento.model.Empregado;


@WebServlet("/ListaEmpregado")
public class ListaEmpregado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ListaEmpregado() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GenericaDao dao=new GenericaDao();
		List<Empregado>listaEmpregado=dao.empregados();
		request.setAttribute("listaEmpregado",listaEmpregado);
		RequestDispatcher saida=request.getRequestDispatcher("formempregado.jsp");
		saida.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
