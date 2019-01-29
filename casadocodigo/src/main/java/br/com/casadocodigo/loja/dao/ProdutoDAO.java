package br.com.casadocodigo.loja.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

@Repository
@Transactional
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager manager;

	public void gravar(Produto produto) {
		manager.persist(produto);

	}
	
	public List<Produto> listarPorNome(String nome){
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		TypedQuery<Produto> query = manager.createQuery("select p from Produto p where p.titulo =: nome", Produto.class);
		query.setParameter("nome", nome);	
		
		List<Produto> resultList = query.getResultList();
		
		for (Produto produto : resultList) {
			produto.getTitulo();
		}
		
		return produtos;
	}

}
