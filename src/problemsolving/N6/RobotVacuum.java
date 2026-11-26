package problemsolving.N6;

public class RobotVacuum extends SmartDevice {
    private String mode;

    public RobotVacuum(String room, String mode) {
        super(room);
        this.mode = mode;
    }

    public void startClean(){
        System.out.println("["+room+"] ["+mode+"] 모드로 청소 시작");
    }
}
