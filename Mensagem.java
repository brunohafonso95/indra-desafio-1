import javax.swing.*;
import java.util.ArrayList;

public class Mensagem {

    public static ArrayList<String> Frases() {
        ArrayList c_messages = new ArrayList();
        String words;
        do {
            words = JOptionPane.showInputDialog("Digite uma palavra,frase ou (0) para finalizar");
            if (!words.equals("0")) {
                c_messages.add(words);
            }
        } while (!words.equals("0"));
        return c_messages;
    }

}
