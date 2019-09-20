package figuras;

import javax.swing.JApplet;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Figuras extends JApplet implements ItemListener {

    private JComboBox combo;
    private JLabel aviso;

    public void init() {
        setSize(600, 500);
        this.getContentPane().setBackground(Color.white);
        setLayout(null);
        combo = new JComboBox();
        combo.setBounds(200, 10, 200, 30);
        add(combo);
        combo.addItem("Seleccionar");
        combo.addItem("Barco de Papel");
        aviso = new JLabel("");
        aviso.setBounds(20, 20, 200, 30);
        add(aviso);

        combo.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        Graficar();
    }

    public void Graficar() {
        String figuras;
        figuras = combo.getSelectedItem().toString();
        Graphics g = getGraphics();

        switch (figuras) {
            case "Seleccionar":
                aviso.setText("Ya se ha seleccionado");
                break;
            case "Barco de Papel":
                int x[] = {298, 298, 230},
                 y[] = {100, 234, 224};
                g.setColor(Color.PINK);
                g.fillPolygon(x, y, 3);

                int a[] = {302, 302, 370},
                 b[] = {100, 234, 224};
                g.setColor(Color.yellow);
                g.fillPolygon(a, b, 3);

                int o[] = {230, 240, 130},
                 p[] = {223, 200, 210};
                g.setColor(Color.GRAY);
                g.fillPolygon(o, p, 3);

                int r[] = {370, 360, 470},
                 s[] = {223, 200, 210};
                g.setColor(Color.GRAY);
                g.fillPolygon(r, s, 3);

                int c[] = {298, 197, 90},
                 d[] = {235, 340, 210};
                g.setColor(Color.orange);
                g.fillPolygon(c, d, 3);

                int f[] = {302, 402, 490},
                 h[] = {235, 340, 210};
                g.setColor(Color.orange);
                g.fillPolygon(f, h, 3);

                int m[] = {301, 200, 395},
                 n[] = {240, 340, 340};
                g.setColor(Color.red);
                g.fillPolygon(m, n, 3);
                break;

        }
    }
}
