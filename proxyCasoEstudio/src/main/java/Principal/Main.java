/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import BossProxy.BossProxy;
import InterfaceBoss.IBoss;
import Model.Boss;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Main {

    public static void main(String[] args) {
        Boss firstBoss = new Boss("Julian",true);
        //El jefe estara disponible por ende podremos acordar una reunion en persona
        System.out.println("Informacion cuando el jefe esta disponible...");
        firstBoss.inPersonMeeting();
        System.out.println(firstBoss.getMeetings());
        System.out.println("***********************************************");
        
        //El jefe ahora no estara disponible
        firstBoss.setAvaible(false);
        useProxy(firstBoss);
        System.out.println("Cuando el jefe no estuvo disponible recibio solicitudes...");
        System.out.println(firstBoss.getMeetings());
    }
    
    static void useProxy(Boss myBoss){
        
        Scanner scanner = new Scanner(System.in);
        //Declaramos el proxy
        IBoss myProxy = new BossProxy();
        int continuar;
        
        //Si el jefe no esta disponible haremos uso del proxy
        if(myBoss.getAvaible() == false ){
            //Lo llamamos por celular
            myProxy.CallByPhone(myBoss);
            //Confirmamos si contesto o no
            System.out.println("Has recibido respuesta? (digita 1 para si, digita 0 para no)");
            continuar = scanner.nextInt();
            //Si la respuesta es negativa pasamos a escribirle por la aplicacion
            if(continuar == 0){
                //Escribimos por la aplicacion
                myProxy.WriteByapplication(myBoss);
                System.out.println("Has recibido respuesta? (digita 1 para si, digita 0 para no)");
                continuar = scanner.nextInt();
                //Si la respuesta es negativa finalmente le enviamos un email
                if(continuar == 0){
                    myProxy.SendEmail(myBoss);
                }
            }
        }
        
    }
}
