/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceBossImpl;

import InterfaceBoss.IBoss;
import Model.Boss;

/**
 *
 * @author TOSHIBA
 */
public class BossImpl implements IBoss {
    @Override
    public void CallByPhone(Boss myBoss) {
        try{
            System.out.println("Se ha realizado una llamada");
            myBoss.setMeetings("Ha recibido una llamada para agendar una reunion...");
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }

    @Override
    public void WriteByapplication(Boss myBoss) {
        try{
            System.out.println("Se ha escrito desde la aplicacion");
            myBoss.setMeetings("Ha recibido un mensaje desde la aplicacion para agendar una reunion...");
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }

    @Override
    public void SendEmail(Boss myBoss) {
        try{
            System.out.println("Se ha enviado un email");
            myBoss.setMeetings("Ha recibido un email para agendar una reunion...");
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
