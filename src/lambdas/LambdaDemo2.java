package lambdas;


interface Logger{
    public void log();
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        Logger consoleLogger = () ->  System.out.println("Sample Console Log");
        consoleLogger.log();
    }
}


