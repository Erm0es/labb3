package edu.lernia.labb3;

public class Patient {
    String name = "";
    boolean isSick = false;
    String sickness = "";

    Patient(String name){
        this.name = name;
        this.isSick = false;
    }

    Patient(String name, String sickness){
        this.name = name;
        if(sickness == null){
           isSick = false;
        } else {
            this.sickness = sickness;
        }
    }

    public String getName(){
        return this.name;
    }

    public Boolean isSick(){
        return isSick;
    }
    
    public String getSickness(){
        return this.sickness;
    }

    public void takeMedication(Medicine medicine){
        if(sickness.equals(medicine.getTreatmentName())){
           isSick = false;
        }else {
            System.out.println("Something went wrong!");
        }
    }

}
