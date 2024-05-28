import univille.log.FabricaLogger;
import univille.log.Logger;
import univille.log.Nivel;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = FabricaLogger.onconsole();
        Logger pastaLogger = FabricaLogger.onfile("log.txt");

        consoleLogger.log(Nivel.DEBUG, "Está é uma mensagem de depuração");
        consoleLogger.log(Nivel.WARNING,"Esta é uma mensagem de cuidado");
        consoleLogger.log(Nivel.ERROR, "Esta é uma mensagem de erro");

        pastaLogger.log(Nivel.DEBUG, "Está é uma mensagem de depuração");
        pastaLogger.log(Nivel.WARNING,"Esta é uma mensagem de cuidado");
        pastaLogger.log(Nivel.ERROR, "Esta é uma mensagem de erro");

    }
}