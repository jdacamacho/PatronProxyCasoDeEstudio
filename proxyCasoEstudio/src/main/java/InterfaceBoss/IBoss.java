/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceBoss;

import Model.Boss;

/**
 *
 * @author TOSHIBA
 */
public interface IBoss {
    //Metodos que se usara para comunicarse con el jefe (Acordar citas)
    void CallByPhone(Boss myBoss);
    void WriteByapplication(Boss myBoss);
    void SendEmail(Boss myBoss);
}
