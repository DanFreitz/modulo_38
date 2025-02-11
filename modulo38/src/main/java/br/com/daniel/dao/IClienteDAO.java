/**
 * 
 */
package br.com.daniel.dao;

import java.util.List;

import br.com.daniel.dao.generic.IGenericDAO;
import br.com.daniel.domain.Cliente;

/**
 * @author Daniel Augusto
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
