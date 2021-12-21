import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {

    JList lista;

    public App() {
        super("Classe JList");

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Cria itens da lista
        String nomes[] = {"José", "João", "Maria",
                         "Romario", "Bebeto"};

        // Cria a JList
        lista = new JList(nomes);

        JButton btn = new JButton("Quantidade de Itens");
        btn.addActionListener(
            new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    int quant = lista.getModel().getSize();

                    JOptionPane.showMessageDialog(null, 
                    "A lista contém " + quant + " itens");
                    
                }
            }
        );

        // Adicona a lista á janela
        c.add(new JScrollPane(lista));

        // Adiciona o botão á janela
        c.add(btn);

        setSize(350, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        
        App app = new App();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
