package abstract_factory;

public abstract class BaseFactoryConnection {

    protected abstract Connection createConnection(String type);

}
