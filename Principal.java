import javax.swing.*;
import java.util.ArrayList;

public class Principal {

    public static ArrayList received_messages = new ArrayList();
    //public static String received_messages[] = new String[5];

    public static void main(String args[]) {


        received_messages = Mensagem.Frases();


        JFrame tela = new JFrame();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JTextArea minhaAreaTexto = new JTextArea(30, 30);
        minhaAreaTexto.setEditable(false);

        JPanel painel = new JPanel();
        painel.add(minhaAreaTexto);
        tela.setContentPane(painel);
        tela.setSize(500, 600);
        tela.setVisible(true);

        for (int cont_m = 0; cont_m < received_messages.size(); cont_m++) {

            minhaAreaTexto.append(received_messages.get(cont_m) + "\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
