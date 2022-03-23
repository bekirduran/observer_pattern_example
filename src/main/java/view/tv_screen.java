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


public class tv_screen implements DisplayCenter, Observer {
    private JPanel panel1;
    private JButton button1;
    private JLabel label1;
    private String text = "No Message!";
    private boolean subscribe = true;
    private PresidentalOffice po;

    public tv_screen(PresidentalOffice po) {
        this.po = po;
        po.register(this);


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
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                subscribe = !subscribe;

                if(subscribe){
                    button1.setText("UN-SUBSCRIBE");
                    button1.setForeground(Color.RED);
                    po.remove(tv_screen.this);
                }else{
                    button1.setText("SUBSCRIBE");
                    button1.setForeground(Color.GREEN);
                    po.register(tv_screen.this);
                }
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    @Override
    public void display() {
        label1.setText(text);
    }

    @Override
    public void update(String msg) {
        if(subscribe){
            this.text = msg;
            display();
        }

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
