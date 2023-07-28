package br.com.departamento.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.departamento.Dao.GenericaDao;
import br.com.departamento.model.Departamento;


@WebServlet("/SelecionarDepartamento")
public class SelecionarDepartamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SelecionarDepartamento() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id=Integer.parseInt(request.getParameter("id"));
		Departamento departamento=new Departamento();
		departamento.setId(id);
		GenericaDao dao=new GenericaDao();
		request.setAttribute("lista",dao.selecionaId(id));
		RequestDispatcher saida=request.getRequestDispatcher("formempregado.jsp");
		saida.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
