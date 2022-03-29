package ru.gb.pugacheva.smarthome;

public class CeilingFan {

    private CeilingFan(){}

    private static CeilingFan ceilingFan;

    public static CeilingFan getInstance(){
        if(ceilingFan==null){
            ceilingFan=new CeilingFan();
        }
        return ceilingFan;
    }

    public void high(){}
    public void medium(){}
    public void low(){}
    public void off(){}
    public void getSpeed(){}
}
