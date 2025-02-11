/**
 * 
 */
package br.com.daniel.dao;

import java.util.List;

import br.com.daniel.dao.generic.IGenericDAO;
import br.com.daniel.domain.Produto;

/**
 * @author Daniel Augusto
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
