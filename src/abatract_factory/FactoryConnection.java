package abatract_factory;

public class FactoryConnection extends AstractFactoryConnection {

	@Override
	protected Connection createContion(String type) {
		if ("Oracle".equals(type)) {
			return new OracleConnection();
		}else if("MySql".equals(type)){
			return new MySqlConnection();
		}
		return new SqlServerConnection();
	}

}
