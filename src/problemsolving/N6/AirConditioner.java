package problemsolving.N6;

public class AirConditioner extends SmartDevice{
    private int temp;

    public AirConditioner(String room, int temp) {
        super(room);
        this.temp = temp;
    }


    public void setcooling(){
        System.out.println("["+room+"] 냉방 가동(희망온도:["+temp+"]도)");
    }
}