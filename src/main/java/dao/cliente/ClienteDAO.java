package dao.cliente;

import java.util.List;
import modelo.Cliente;

/**
 * DAO é um Design Pattern que encapsula e abstrai o acesso aos dados.
 *
 * Operações para acesso aos dados de cliente.
 *
 */
public interface ClienteDAO {

    public boolean salvar(Cliente cliente);

    public Cliente consultarPK(int clienteId);

    public boolean apagarPK(int cienteId);

    public List consultarTudo();
}
