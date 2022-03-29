package ru.gb.pugacheva.smarthome;

public class SecurityAlarm {

    private SecurityAlarm(){}

    private static SecurityAlarm securityAlarm;

    public static SecurityAlarm getInstance(){
        if(securityAlarm==null){
            securityAlarm=new SecurityAlarm();
        }
        return securityAlarm;
    }

    public void arm(){}
    public void disarm(){}
}
