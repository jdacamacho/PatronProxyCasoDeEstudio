/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author TOSHIBA
 */
public class Boss {
    private String name;
    private boolean avaible;
    //Array para almacenar las reuniones
    private ArrayList<String> meetings;

    public Boss(String name, boolean avaible) {
        this.name = name;
        this.avaible = avaible;
        this.meetings = new ArrayList<String>();
    }
   
    //Cuando el jefe no este activo haremos uso del proxy
    public boolean inPersonMeeting(){
        if(this.avaible == true){
            System.out.println("Reunion completada con exito!");
            this.meetings.add("Se ha realizado una reunion en persona");
            return true;
        }
        System.out.println("El jefe no se encuentra disponible...");
        return false;
    }
    
    //Para obtener las solicitudes de reunion del jefe
    public String getMeetings(){
        String meetingsReturn = "";
        for (int i = 0 ; i < meetings.size() ; i++){
            meetingsReturn = meetingsReturn + " " + meetings.get(i) + "\n";
        }
        return meetingsReturn;
    }
    
    //Para agregar una nueva solicitud de reunion
    public void setMeetings(String newMeeting){
        this.meetings.add(newMeeting);
    }
    
    public boolean getAvaible(){
        return this.avaible;
    }
    
    public void setAvaible(boolean avaible){
        this.avaible = avaible;
    }
}
