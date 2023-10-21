package one.digitalinnovation.labpadroesprojetospring.service;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma interface.
 *
 * @author VictorLucena
 */
public interface ClienteService {
    Iterable<Cliente> buscartodos();

    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
