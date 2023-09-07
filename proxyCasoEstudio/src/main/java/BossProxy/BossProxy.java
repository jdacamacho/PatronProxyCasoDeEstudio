/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BossProxy;

import InterfaceBoss.IBoss;
import InterfaceBossImpl.BossImpl;
import Model.Boss;

/**
 *
 * @author TOSHIBA
 */
public class BossProxy implements IBoss{
    /*bossReal actuara como si fuera el jefe real y se encargara de
    almacenar la informacion correspondiente a la reuniones solicitadas*/
    private BossImpl bossReal;
            
    @Override
    public void CallByPhone(Boss myBoss) {
        if (bossReal == null){
            bossReal = new BossImpl();
            bossReal.CallByPhone(myBoss);
        }
        else{
            bossReal.CallByPhone(myBoss);
        }
    }

    @Override
    public void WriteByapplication(Boss myBoss) {
        if (bossReal == null){
            bossReal = new BossImpl();
            bossReal.WriteByapplication(myBoss);
        }
        else{
            bossReal.WriteByapplication(myBoss);
        }
    }

    @Override
    public void SendEmail(Boss myBoss) {
        if (bossReal == null){
            bossReal = new BossImpl();
            bossReal.SendEmail(myBoss);
        }
        else{
            bossReal.SendEmail(myBoss);
        }
    }
    
}
