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
public class PotMod {
    private int result;
    void setPoten(int Num){
        this.result = Num* Num;
    }
    public int getResult(){
        return result;
    }
}
