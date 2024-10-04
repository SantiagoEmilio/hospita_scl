package view;

import java.awt.*;
import java.util.ArrayList;
import model.salas;

import javax.swing.*;

public class salasview extends JPanel {
    private ArrayList<salas>listado;

    salasview(ArrayList<salas> listado){
        this.listado=listado;
    initpn();
    }
    public void initpn(){
        setLayout(new GridLayout(3,3));
        for (salas salas:listado){
            JPanel pns=crearpns(salas.getNombre(),salas.getEstado());
            add(pns);
        }

    }
    public JPanel crearpns(String nombre, String estado){
        JPanel pn=new JPanel();
        pn.setLayout(new BorderLayout());
        JLabel nombreLabel = new JLabel(nombre, SwingConstants.CENTER);
        nombreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        pn .add(nombreLabel, BorderLayout.CENTER);

        switch (estado) {
            case "En uso":
                pn.setBackground(Color.RED);
                break;
            case "Fuera de servicio":
                pn.setBackground(Color.YELLOW);
                break;
            case "Disponible":
                pn.setBackground(Color.GREEN);
                break;

        }

        pn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return pn;
    }
}
