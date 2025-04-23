package pl.bialek.pwr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WzorzecMostBialekApplication {

    public static void main(String[] args) {
        Document doc = new Document();
        Editor editor = new Editor();

        Command copy = new CopyCommand(doc, "Hello ");
        Command paste = new PasteCommand(doc);

        editor.executeCommand(copy);
        editor.executeCommand(paste);
        editor.executeCommand(paste);

        //Przykładowa operacja ( w naszym przypadku wywołanie cofnięcie ostatniego wklejania)
        editor.undoLastCommand();
    }

}
