/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cadastroee.servlets;

import cadastroee.model.Produtos;
import cadatroee.controller.ProdutosFacadeLocal;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import org.glassfish.soteria.Utils;

/**
 *
 * @author sendi
 */
@WebServlet(name = "ServletProdutoFC", urlPatterns = {"/ServletProdutoFC"})
public class ServletProdutosFC extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB
    ProdutosFacadeLocal facade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int idProduto, quantidade;
        long valorUnitario;
        Produtos produtos;
        String nome;
        List<Produtos> listaProdutos;

        String acao = request.getParameter("acao");
        
//        acao = acao == null ? "listar": acao ; 
        
        String destino = "ProdutoLista.jsp";

        if (acao == null) acao = "listar";
            switch (acao) {
                case "listar":
                    listaProdutos = facade.findAll();
                    request.setAttribute("listaProdutos", listaProdutos);
                    break;
                case "incluir":
                    nome = request.getParameter("nome");
                    valorUnitario = Long.parseLong(request.getParameter("valor"));
                    quantidade = Integer.parseInt(request.getParameter("quantidade"));

                    produtos = new Produtos();
                    produtos.setNome(nome);
                    produtos.setPrecoVenda(valorUnitario);
                    produtos.setQuantidade(quantidade);

                    facade.create(produtos);
                    
                    listaProdutos = facade.findAll();
                    request.setAttribute("listaProdutos", listaProdutos);
                    break;
                case "alterar":
                    
                                 
                    idProduto = Integer.parseInt(request.getParameter("id"));
                    nome = request.getParameter("nome");
                    valorUnitario = Long.parseLong(request.getParameter("valor"));
                    quantidade = Integer.parseInt(request.getParameter("quantidade"));

                    produtos = facade.find(idProduto);
                    produtos.setNome(nome);
                    produtos.setPrecoVenda(valorUnitario);
                    produtos.setQuantidade(quantidade);

                    facade.edit(produtos);

                    listaProdutos = facade.findAll();
                    request.setAttribute("listaProdutos", listaProdutos);
                    break;
                case "excluir":
                 
                    idProduto = Integer.parseInt(request.getParameter("id"));   
                    produtos = facade.find(idProduto);
                    facade.remove(produtos);

                    listaProdutos = facade.findAll();

                    request.setAttribute("listaProdutos", listaProdutos);

                    break;
                case "formIncluir":
                    destino = "ProdutoDados.jsp";
                    break;
                case "formAlterar":
                    destino = "ProdutoDados.jsp";
                    idProduto = Integer.parseInt(request.getParameter("id"));
                    produtos = facade.find(idProduto);
                    request.setAttribute("produto", produtos);

                    break;
                default:
                    // Ação inválida - adicione um tratamento apropriado, se necessário
                    break;
            }
        
        request.getRequestDispatcher(destino).forward(request, response);
    }
}
