package ch02;

import static java.lang.String.join;

public class gyogwasiuup37 {
    static void main(String[] args) {
        String[] item = {"키보드","마우스","모티너암"};
        int[] price = {89000,35000,45000};
        int total = 0;
        for (int i = 0; i < price.length; i++) {
            total+=price[i];
        }
        System.out.println("===영수증===");
        System.out.println("구매품목:"+join(",","키보드","마우스","모니터암"));
        System.out.println("품목개수:"+price.length);
        System.out.println("-----------");
        System.out.println("결제금액:"+total);
    }
}
