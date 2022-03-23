/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author morph
 */
public class PresidentalOffice implements Subject{
    
    private ArrayList<Observer> observers;
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }

    public PresidentalOffice() {
        observers = new ArrayList<Observer>();
    }



    @Override
    public void register(Observer o) {
        this.observers.add(o);
       
    }

    @Override
    public void remove(Observer o) {
        int index = observers.indexOf(o);
        if (index <0){
            System.out.println("There is no observer!");
        }else{
            observers.remove(index);
                     
        }            
        
    }

    
    @Override
    public void notifyObserver() { 
        for(Observer o: observers)
            o.update(msg);
    }
    
    
    public void statusChange(){
        notifyObserver();
    }
     
    
    
}
