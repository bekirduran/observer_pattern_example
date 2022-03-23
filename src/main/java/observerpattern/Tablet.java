/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author morph
 */
public class Tablet  implements Observer, DisplayCenter{
    
    
    String msg;
    private Subject presidentalOffice;

    public Tablet(Subject po) {
        this.presidentalOffice = po;
        presidentalOffice.register(this);
    }
    
        public void remove(){
        presidentalOffice.remove(this);
     }
    



    @Override
    public void display() {
      System.out.println("Drrrzzzzz!! Tablet displaying alert!!: "+msg);
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        display();
    }
    
}
