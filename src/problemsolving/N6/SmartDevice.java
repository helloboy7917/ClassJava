package problemsolving.N6;

public class SmartDevice {
    protected String room;

    public SmartDevice(String room) {
        this.room = room;
    }

    public void turnOn(){
        System.out.println("["+room+"] 기기 전원 on");
    }
}
