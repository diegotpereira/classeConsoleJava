import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {

    public App() {
        super("Eventos do Mouse e Teclado");

        Container c = getContentPane();
        PainelDesenho painel = new PainelDesenho();

        c.add(painel, BorderLayout.CENTER);
        c.add(new JLabel("Arraste o mouse para desenhar..."),
                         BorderLayout.SOUTH);

        setSize(350, 250);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class PainelDesenho extends JPanel {

    private int quantPontos = 0;
    private Point pontos[] = new Point[10000];

    public PainelDesenho() {
        this.setBackground(Color.WHITE);

        this.addMouseMotionListener(
            new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    if (quantPontos < pontos.length) {
                        pontos[quantPontos] = e.getPoint();
                        quantPontos ++;
                        repaint();
                    }
                }
            }
        );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i < quantPontos; i++) {
            g.fillOval(pontos[i].x, pontos[i].y, 4, 4);
        }
    }
}
