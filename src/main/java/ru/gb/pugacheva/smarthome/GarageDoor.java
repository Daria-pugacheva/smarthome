package ru.gb.pugacheva.smarthome;

public class GarageDoor {

    private GarageDoor(){}

    private static GarageDoor garageDoor;

    public static GarageDoor getInstance(){
        if(garageDoor==null){
            garageDoor=new GarageDoor();
        }
        return garageDoor;
    }

    public void up(){
        System.out.println("GarageDoor is up");
    }
    public void down(){
        System.out.println("GarageDoor is down");
    }
    public void stop(){}
    public void lock(){
        System.out.println("GarageDoor is locked");
    }
    public void unlock(){
        System.out.println("GarageDoor is unlocked");
    }
}
