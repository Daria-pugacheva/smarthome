package ru.gb.pugacheva.smarthome;

public class RemoteControl {

    private final BedroomLight bedroomLight;
    private final CeilingFan ceilingFan;
    private final GarageDoor garageDoor;
    private final KitchenLight kitchenLight;
    private final SecurityAlarm securityAlarm;
    private final Stereo stereo;
    private final TV tv;

    private int lastOperationNumber;
    private OperationType lastOperationType;

    public enum OperationType{
        ON, OFF
    }

    public RemoteControl() {
        this.bedroomLight = BedroomLight.getInstance();
        this.ceilingFan = CeilingFan.getInstance();
        this.garageDoor = GarageDoor.getInstance();
        this.kitchenLight = KitchenLight.getInstance();
        this.securityAlarm = SecurityAlarm.getInstance();
        this.stereo = Stereo.getInstance();
        this.tv = TV.getInstance();
    }

    public void on(int slotNumber) {
        lastOperationType = OperationType.ON;
        lastOperationNumber = slotNumber;
        switch (slotNumber) {
            case 1:
                tv.on();
                break;
            case 2:
                stereo.play();
                break;
            case 3:
                garageDoor.unlock();
                garageDoor.up();
                break;
            case 4:
                bedroomLight.voiceOn();
                break;
            case 5:
                System.out.println("Nothing happens");
                break;
            case 6:
                kitchenLight.on();
                bedroomLight.voiceOn();
                break;
            case 7:
                kitchenLight.on();
                bedroomLight.voiceOn();
                tv.on();
                stereo.play();
                garageDoor.unlock();
                garageDoor.up();
                break;
            default:
                System.out.println("No one available slotNumber was chosen: click 1,2,3,4,6 or 7");
                break;
        }
    }

    public void off(int slotNumber) {
        lastOperationType = OperationType.OFF;
        lastOperationNumber = slotNumber;
        switch (slotNumber) {
            case 1:
                tv.off();
                break;
            case 2:
                stereo.stop();
                break;
            case 3:
                garageDoor.down();
                garageDoor.lock();
                break;
            case 4:
                bedroomLight.voiceOff();
                break;
            case 5:
                System.out.println("Nothing happens");
                break;
            case 6:
                kitchenLight.off();
                bedroomLight.voiceOff();
                break;
            case 7:
                kitchenLight.off();
                bedroomLight.voiceOff();
                tv.off();
                stereo.stop();
                garageDoor.down();
                garageDoor.lock();
                break;
            default:
                System.out.println("No one available slotNumber was chosen: click 1,2,3,4,6 or 7");
                break;
        }
    }

    public void undo (){
        if(lastOperationType==OperationType.ON){
            off(lastOperationNumber);
        }else {
            on(lastOperationNumber);
        }
    }

}
