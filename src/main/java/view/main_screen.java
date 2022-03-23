package view;

import observerpattern.PresidentalOffice;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main_screen {

    PresidentalOffice po = new PresidentalOffice();

    public static void main(String[] args) {
        JFrame frame = new JFrame("PresidentalOffice");
        frame.setContentPane(new main_screen().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    private JPanel panel1;

    private JTextField textField1;
    private JButton sendButton;
    private JButton openButton;
    private JButton openButton1;
    private JButton openButton2;

    public main_screen() {

        sendButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text = textField1.getText();
                po.setMsg(text);
                JOptionPane.showMessageDialog(null," Successfully sent the notification!! ");
            }
        });
        openButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame tvframe = new JFrame("TV");
                tv_screen tv = new tv_screen(po);
                tvframe.setContentPane(tv.getPanel1());
                tvframe.setVisible(true);
                tvframe.pack();
                tvframe.setLocationRelativeTo(null);
                tvframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            }
        });
        openButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JFrame tabletFrame = new JFrame("TABLET");
                tablet_screen tablet = new tablet_screen(po);
                tabletFrame.setContentPane( tablet.getPanel1());
                tabletFrame.setVisible(true);
                tabletFrame.pack();
                tabletFrame.setLocationRelativeTo(null);
                tabletFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        openButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JFrame phoneFrame = new JFrame("PHONE");
                phone_screen p = new phone_screen(po);
                phoneFrame.setContentPane( p.getPanel1());
                phoneFrame.setVisible(true);
                phoneFrame.pack();
                phoneFrame.setLocationRelativeTo(null);
                phoneFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }




}
