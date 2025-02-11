/**
 * 
 */
package br.com.daniel.service;

import java.util.List;

import br.com.daniel.domain.Produto;
import br.com.daniel.services.generic.IGenericService;

/**
 * @author Daniel Augusto
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
