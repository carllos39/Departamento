package br.com.departamento.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.departamento.Dao.GenericaDao;
import br.com.departamento.model.FichaCadastral;



@WebServlet("/RemoverFicha")
public class RemoverFicha extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public RemoverFicha() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer fid=Integer.parseInt(request.getParameter("fid"));
		FichaCadastral fichaCadastral=new FichaCadastral();
		fichaCadastral.setFid(fid);
		GenericaDao dao=new GenericaDao();
		dao.remover(fichaCadastral);
		RequestDispatcher saidas=request.getRequestDispatcher("fichaCadastrar.jsp");
		saidas.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
