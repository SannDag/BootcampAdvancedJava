public class Main {
    public static void main(String[] args) {

        Singleton app1 = Singleton.getInstance();
        Singleton app2 = Singleton.getInstance();

        app1.Run();
        app2.Run();

    }
}
