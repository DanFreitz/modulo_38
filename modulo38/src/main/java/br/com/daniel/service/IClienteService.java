/**
 * 
 */
package br.com.daniel.service;

import java.util.List;

import br.com.daniel.domain.Cliente;
import br.com.daniel.exceptions.DAOException;
import br.com.daniel.services.generic.IGenericService;

/**
 * @author Daniel Augusto
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
