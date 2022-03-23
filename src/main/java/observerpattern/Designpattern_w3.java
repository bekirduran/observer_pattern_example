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
public class Designpattern_w3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PresidentalOffice po = new PresidentalOffice();
        
        TV gencayTv = new TV(po);
        CellPhone bekirCellphone = new CellPhone(po);
        Tablet tablet = new Tablet(po);
        
        po.setMsg("Dolar 1.5 tl ye indi!!!!!!");
        
        tablet.remove();
        
        po.setMsg("Hata");
        
        TV bekirTV = new TV(po);
        
        po.setMsg("Benzin Bedava!!!!");
        
    }
    
}
