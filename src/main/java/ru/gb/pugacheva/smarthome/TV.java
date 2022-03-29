package ru.gb.pugacheva.smarthome;

public class TV {

    private TV(){}

    private static TV tv;

    public static TV getInstance(){
        if(tv==null){
            tv=new TV();
        }
        return tv;
    }

    public void on(){
        System.out.println("TV is on");
    }
    public void off(){
        System.out.println("TV is off");
    }
    public void setChannel(){}
    public void setVolume(){}
}
