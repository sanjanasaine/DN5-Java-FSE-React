public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        logger1.info("Application Started");
        logger2.warning("Low Memory Warning");
        logger3.error("Database Connection Failed");

        System.out.println("logger1 == logger2 : "
                + (logger1 == logger2));

        System.out.println("logger2 == logger3 : "
                + (logger2 == logger3));

        System.out.println("logger1 == logger3 : "
                + (logger1 == logger3));
    }
}