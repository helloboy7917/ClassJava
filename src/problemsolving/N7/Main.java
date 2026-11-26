package problemsolving.N7;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();//전자기기 갯수
        SmartDevice[] list = new SmartDevice[n];//전자기기 방 생성

        for (int i = 0; i < n; i++) {
            String type = in.next();
            String room = in.next();
            if(type.equals("AC")){

                list[i] = new AirConditioner(room,in.nextInt());

            }else if (type.equals("RV")){
                list[i] = new RobotVacuum(room, in.next());
            }
        }

        for (SmartDevice s : list) {
            if(s instanceof AirConditioner a) {
                s.turnOn();
                //AirConditioner a = (AirConditioner) s;
                a.setcooling();
            }else if(s instanceof RobotVacuum r){
                s.turnOn();
                //RobotVacuum r = (RobotVacuum) s;
                r.startClean();
            }
        }
    }
}
