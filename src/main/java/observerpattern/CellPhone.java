package observerpattern;

/**
 *
 * @author morph
 */
public class CellPhone implements Observer, DisplayCenter{
    
    String msg;
    private Subject presidentalOffice;

    public CellPhone(Subject po) {
        this.presidentalOffice = po;
        presidentalOffice.register(this);
    }
    
        public void remove(){
        presidentalOffice.remove(this);
     }
    



    @Override
    public void display() {
      System.out.println("Ding Dong!! CellPhone displaying something: "+msg);
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        display();
    }
    
}
