package pattern.singleton;

public class ConnectionDBSingletonPattern {

    private static ConnectionDBSingletonPattern instance;

    private ConnectionDBSingletonPattern(){
        System.out.println("Connecting to DB....");
    }

    public static ConnectionDBSingletonPattern getInstance(){
        if (instance == null) {
            instance = new ConnectionDBSingletonPattern();
        }
        return instance;
    }
}
