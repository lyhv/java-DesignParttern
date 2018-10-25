package abstract_factory;

public class FactoryConnection extends BaseFactoryConnection {

    @Override
    protected Connection createConnection(String type) {
        if ("Oracle".equals(type)) {
            return new OracleConnection();
        } else if ("MySql".equals(type)) {
            return new MySqlConnection();
        }
        return new SqlServerConnection();
    }
}
