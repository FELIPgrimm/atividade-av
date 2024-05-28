package univille.log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class PastaLogger implements Logger{
    private String filename;

    public PastaLogger (String filename){
        this.filename = filename;
    }

    @Override
    public void log(Nivel nivel, String mensagem){
        try (FileWriter writer = new FileWriter(filename, true)){
            writer.write(LocalDateTime.now() + "[" + nivel + "]" + mensagem + "\n");

        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
