/**
 * 
 */
package br.com.daniel.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.daniel.dao.IProdutoDAO;
import br.com.daniel.domain.Produto;
import br.com.daniel.services.generic.GenericService;

/**
 * @author Daniel Augusto
 *
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
