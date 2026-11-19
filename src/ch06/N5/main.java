package ch06.N5;

public class main {
    static void main() {
        Phone[] phones={new Phone("황진이"), new Telephone("나상효","내일"), new Smartphone("김세현","","더바인딩오브아이작")};


        for (Phone i :phones) {
            if (i instanceof Smartphone s){
                // Smartphone s=(Smartphone) i;
                s.playGame();
            } else if (i instanceof Telephone t) {
                // Telephone t=(Telephone) i;
                t.auto();
            }else {
                i.talk();
            }

        }
    }
}
