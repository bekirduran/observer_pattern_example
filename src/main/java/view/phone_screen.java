package view;

import observerpattern.DisplayCenter;
import observerpattern.Observer;
import observerpattern.PresidentalOffice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class phone_screen implements DisplayCenter, Observer {
    private JButton button1;
    private JLabel label1;
    private boolean subscribe = true;
    private JPanel panel1;
    private String textMsg = "No Message";
    private final PresidentalOffice po;

    public JPanel getPanel1() {
        return panel1;
    }

    public phone_screen(PresidentalOffice po) {
        this.po = po;
        po.register(this);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                subscribe = !subscribe;

                if(subscribe){
                    button1.setText("UN-SUBSCRIBE");
                    button1.setForeground(Color.RED);
                    po.remove(phone_screen.this);
                }else{
                    button1.setText("SUBSCRIBE");
                    button1.setForeground(Color.GREEN);
                    po.register(phone_screen.this);
                }

            }
        });
        panel1.addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {
                JComponent component = (JComponent)e.getSource();
                if ((HierarchyEvent.SHOWING_CHANGED & e.getChangeFlags()) != 0
                        &&  component.isShowing())
                {


                    if(subscribe){
                        button1.setText("UN-SUBSCRIBE");
                        button1.setForeground(Color.RED);

                    }
                    else{
                        button1.setText("SUBSCRIBE");
                        button1.setForeground(Color.GREEN);

                    }

                }
            }
        });
    }


    @Override
    public void display() {
        label1.setText(textMsg);
    }

    @Override
    public void update(String msg) {
        if (subscribe ){
            textMsg = msg;
            display();
        }
    }
}
