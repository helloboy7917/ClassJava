package cho4.N8;

import java.util.Random;

public class roll {
    Random a = new Random();
    public int roll(){
        int i;
        i = a.nextInt(1,7);
        return i;
    }


}
