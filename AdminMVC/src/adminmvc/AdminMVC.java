/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminmvc;

/**
 *
 * @author Juan D Candy
 */
public class AdminMVC {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewPot Viw = new ViewPot();
        PotMod Mode = new PotMod();
        PotControl theCont = new PotControl(Viw, Mode);
        Viw.setVisible(true);
    }
}
