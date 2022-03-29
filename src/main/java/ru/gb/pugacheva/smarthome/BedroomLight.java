package ru.gb.pugacheva.smarthome;

public class BedroomLight {

    private BedroomLight(){}

    private static BedroomLight bedroomLight;

    public static BedroomLight getInstance(){ //без учета многопоточки: тут, вроде, нет необходимости
        if(bedroomLight==null){
            bedroomLight=new BedroomLight();
        }
        return bedroomLight;
    }

    public void voiceOn(){
        System.out.println("BedroomLight is on");
    }
    public void voiceOff(){
        System.out.println("BedroomLight is of");
    }
    public void dim(){}
}
