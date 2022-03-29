package ru.gb.pugacheva.smarthome;

public class MainApp {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.on(1);
        remoteControl.undo();
        remoteControl.off(5);
        remoteControl.off(7);
       remoteControl.on(9);
    }
}
