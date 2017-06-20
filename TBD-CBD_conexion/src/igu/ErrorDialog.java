package igu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Raul
 */
public class ErrorDialog {
    public static void dialog(Frame parent, String mensaje) {
        final JDialog jd= new JDialog(parent, "Error", true);
        JTextArea t= new JTextArea(5,60);
        t.setLineWrap(true);
        t.setEditable(false);
        t.setText(mensaje);
        jd.setLayout(new BorderLayout());
        JPanel panelClose= new JPanel();
        FlowLayout f= new FlowLayout();
        f.setAlignment(FlowLayout.RIGHT);
        panelClose.setLayout(f);
        JButton close= new JButton("Cerrar");
        close.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                jd.dispose();
            }
        });
        panelClose.add(close);
        jd.add(new JScrollPane(t), BorderLayout.CENTER);
        jd.add(panelClose, BorderLayout.SOUTH);
        jd.pack();
        jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd.setVisible(true);
    }
}
