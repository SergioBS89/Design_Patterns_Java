package pattern.singleton;

public class SingletonPattern {
    public static void main(String[] args) {

        /**
         * The Singleton pattern in Java is a design pattern that ensures a class has only one instance and provides a global point of access to that instance.
         * This pattern involves a single class responsible for creating an instance and providing a way to access it.
         */
        for (int i = 0; i < 10; i++) {
            ConnectionDBSingletonPattern connection = ConnectionDBSingletonPattern.getInstance();
            System.out.println("Same instance =" + connection);
        }
    }
}
