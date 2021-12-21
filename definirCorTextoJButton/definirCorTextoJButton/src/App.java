import java.awt.*;
import javax.swing.*;

public class App extends JFrame {

    public App() {
        super("Estudos Swing");

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Cria JButton com a cor do texto vermelho
        JButton btn1 = new JButton("Clique Aqui");
        btn1.setForeground(Color.RED);

        // Cria JButton com a cor de fundo verde
        JButton btn2 = new JButton("Clique Aqui");
        btn2.setForeground(Color.GREEN);

        // Adiciona os botões á janela
        c.add(btn1);
        c.add(btn2);

        setSize(350, 250);
        setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        
        App app = new App();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
