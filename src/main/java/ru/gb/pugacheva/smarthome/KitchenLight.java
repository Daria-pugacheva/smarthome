package ru.gb.pugacheva.smarthome;

public class KitchenLight {

    private KitchenLight(){}

    private static KitchenLight kitchenLight;

    public static KitchenLight getInstance(){
        if(kitchenLight==null){
            kitchenLight=new KitchenLight();
        }
        return kitchenLight;
    }

    public void on(){
        System.out.println("KitchenLight is on");
    }
    public void off(){
        System.out.println("KitchenLight is off");
    }
}
