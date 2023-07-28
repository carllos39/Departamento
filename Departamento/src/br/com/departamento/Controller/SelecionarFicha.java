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
import br.com.departamento.model.FichaCadastral;


@WebServlet("/SelecionarFicha")
public class SelecionarFicha extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SelecionarFicha() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer eid=Integer.parseInt(request.getParameter("eid"));
		Empregado empregado=new Empregado();
		empregado.setEid(eid);
		GenericaDao dao=new GenericaDao();
		request.setAttribute("empregado",dao.SelecionarEmpregado(eid));
		RequestDispatcher saida=request.getRequestDispatcher("fichaCadastral.jsp");
		saida.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer eid=Integer.parseInt(request.getParameter("eid"));
		String nome=request.getParameter("nome");
		String rua=request.getParameter("rua");
		Integer numero=Integer.parseInt(request.getParameter("numero"));
		String bairro=request.getParameter("bairro");
		String cidade=request.getParameter("cidade");
		String estado=request.getParameter("estado");
		String pais=request.getParameter("pais");
		String telefone=request.getParameter("telefone");
		String email=request.getParameter("email");
		Empregado empregado=new Empregado();
		FichaCadastral fichaCadastral=new FichaCadastral();
		fichaCadastral.setNome(nome);
		fichaCadastral.setRua(rua);
		fichaCadastral.setNumero(numero);
		fichaCadastral.setBairro(bairro);
		fichaCadastral.setCidade(cidade);
		fichaCadastral.setEstado(estado);
		fichaCadastral.setPais(pais);
		fichaCadastral.setTelefone(telefone);
		fichaCadastral.setEmail(email);
		empregado.setEid(eid);
		fichaCadastral.setEmpregado(empregado);
		GenericaDao dao=new GenericaDao();
		dao.cadastrarEnderenco(fichaCadastral);
		PrintWriter sa=response.getWriter();
		sa.print("<html><body>");
		sa.print("<h1>Cadastrado com sucesso!</h1>");
		sa.print("</body></html>");
		
		
	}
	}


