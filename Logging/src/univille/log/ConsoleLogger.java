package univille.log;

public class ConsoleLogger implements Logger{
    @Override
    public void log (Nivel nivel, String mensagem){
        String cor;
        switch (nivel){
            case DEBUG:
                cor = "\u001B[32m";
                break;
            case WARNING:
                cor = "\u001B[33m";
                break;
            case ERROR:
                cor = "\u001B[31m";
                break;
            default:
                cor = "\u001B[0m";
        }
        System.out.println(cor + "[" + nivel + "]" + mensagem + "\"\\u001B[0m\"");
    }
}
