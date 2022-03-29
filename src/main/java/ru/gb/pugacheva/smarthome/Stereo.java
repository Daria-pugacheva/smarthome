package ru.gb.pugacheva.smarthome;

public class Stereo {

    private Stereo(){}

    private static Stereo stereo;

    public static Stereo getInstance(){
        if(stereo==null){
            stereo=new Stereo();
        }
        return stereo;
    }

    public void play(){
        System.out.println("Stereo is on (playing)");
    }
    public void stop(){
        System.out.println("Stereo is on (stopped)");
    }
    public void setCD(){}
    public void setCDTrack(){}
    public void setRadio(){}
    public void setRadioChannel(){}
    public void setVolume(){}
}
