package br.com.departamento.Controller;

import java.io.IOException;
import java.io.PrintWriter;
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



@WebServlet("/EmpregadoController")
public class EmpregadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmpregadoController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GenericaDao dao=new GenericaDao();
		List<Departamento>lista=dao.buscaTodos();
		request.setAttribute("lista",lista);
		RequestDispatcher saida=request.getRequestDispatcher("formempregado.jsp");
		saida.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer id=Integer.parseInt(request.getParameter("id"));
		String nome=request.getParameter("nome");
		Double salario=Double.parseDouble(request.getParameter("salario"));
		String cargo=request.getParameter("cargo");
		String eid=request.getParameter("eid");
		Departamento departamento=new Departamento();
		Empregado empregado=new Empregado();
		if(eid!=""){
		empregado.setEid(Integer.parseInt(eid));	
		}
		empregado.setNome(nome);
		empregado.setSalario(salario);
		empregado.setCargo(cargo);
		departamento.setId(id);
		empregado.setDepartamento(departamento);
		GenericaDao dao=new GenericaDao();
		dao.salvar(empregado);
		PrintWriter sa=response.getWriter();
		sa.print("<html><body>");
		sa.print("<h1>Cadastrado com sucesso!</h1>");
		sa.print("</body></html>");
		
	}

}
