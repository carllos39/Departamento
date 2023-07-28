package br.com.departamento.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.departamento.Dao.GenericaDao;
import br.com.departamento.model.Empregado;


@WebServlet("/RemoverEmpregado")
public class RemoverEmpregado extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RemoverEmpregado() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer eid=Integer.parseInt(request.getParameter("eid"));
		Empregado empregado=new Empregado();
		empregado.setEid(eid);
		GenericaDao dao=new GenericaDao();
		dao.remover(empregado);
		RequestDispatcher saida=request.getRequestDispatcher("formempregado.jsp");
		saida.forward(request, response);
		PrintWriter sa=response.getWriter();
		sa.print("<html><body>");
		sa.print("<h1>Removido com sucesso!</h1>");
		sa.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
