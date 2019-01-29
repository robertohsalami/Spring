package casadocodigo;

import java.util.List;

import br.com.casadocodigo.loja.dao.ProdutoDAO;
import br.com.casadocodigo.loja.models.Produto;

public class TesteJPQL {

	public static void main(String[] args) {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> listarPorNome = produtoDAO.listarPorNome("TDD");
				

	}

}
