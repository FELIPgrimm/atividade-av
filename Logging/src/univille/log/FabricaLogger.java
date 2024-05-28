package univille.log;

public class FabricaLogger {
    public static Logger onconsole(){
        return new ConsoleLogger();
    }
    public static Logger onfile(String filename){
        return new PastaLogger(filename);
    }
}
