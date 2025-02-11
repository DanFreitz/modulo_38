/**
 * 
 */
package br.com.daniel.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.daniel.dao.generic.GenericDAO;
import br.com.daniel.domain.Cliente;

/**
 * @author Daniel Augusto
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		TypedQuery<Cliente> tpQuery = 
				this.entityManager.createNamedQuery("Cliente.findByNome", this.persistenteClass);
		tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
		
	}

}
