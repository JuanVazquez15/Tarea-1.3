/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminmvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Juan D Candy
 */
public class PotControl {
    private ViewPot View;
    private PotMod Mod;
public PotControl(ViewPot View, PotMod Mod){
    this.View = View;
    this.Mod = Mod;
    this.View.addCallListener(new CalListener()); 
}
class CalListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==View.bot){
            //Mod.setPoten(View.getnum());
            //View.setCalcSolution(Mod.getResult());
            Mod.setPoten(Integer.parseInt(View.num.getText()));
            View.lab.setText("R: " +Integer.toString(Mod.getResult()));
        }
    }
}
}
    

