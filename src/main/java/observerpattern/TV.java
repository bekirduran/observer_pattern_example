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
public class TV  implements Observer, DisplayCenter{
    String msg;
    private Subject presidentalOffice;

    public TV(Subject po) {
        this.presidentalOffice = po;
        po.register(this);
    }

    public void remove(){
        presidentalOffice.remove(this);
         }


    @Override
    public void display() {
        System.out.println("The TV displaying something: "+msg);
       
    }

    @Override
    public void update(String msg) {
        this.msg = msg;        
        display();
    }
    
}
