package ch02;

public class gyogwasiuup36 {
    static void main(String[] arga) {
        String[] rawNames = {" kim ", "LEE", " park", " Choi "};
        String target= "lee";
        int longNameCount =0;
        boolean isFound = false;
        for (int i = 0; i < rawNames.length; i++) {
            rawNames[i] = rawNames[i].trim();
        }

        for (int i = 0; i < rawNames.length; i++) {
            if (rawNames[i].length() >= 4) {
                longNameCount+=1;
            }
        }
        System.out.println(longNameCount);

        for (int i = 0; i < rawNames.length; i++) {
            if (rawNames[i].equalsIgnoreCase("lee")) {
                isFound = true;
            }
        }
    }
}
