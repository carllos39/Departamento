package br.com.departamento.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.departamento.Dao.GenericaDao;
import br.com.departamento.model.Departamento;
import br.com.departamento.model.Empregado;


@WebServlet("/DepartamentoController")
public class DepartamentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
    public DepartamentoController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GenericaDao dao=new GenericaDao();
		List<Departamento>lista=dao.buscaTodos();
		request.setAttribute("lista",lista);
		RequestDispatcher saida=request.getRequestDispatcher("formdepartamento.jsp");
		saida.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome=request.getParameter("nome");
		String id=request.getParameter("id");
		
		Empregado empregado=new Empregado();
		List<Empregado>empregados=new ArrayList<>();
		empregados.add(empregado);
		Departamento departamento=new Departamento();
		if(id!=""){
		departamento.setId(Integer.parseInt(id));
		}
		departamento.setNome(nome);
		departamento.setEmpregados(empregados);
	
		GenericaDao dao=new GenericaDao();
		dao.salvar(departamento);
		PrintWriter sa=response.getWriter();
		sa.print("<html><body>");
		sa.print("<h1>Cadastrado com sucesso!</h1>");
		sa.print("</body></html>");
		
	}

}
