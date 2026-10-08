package cho3;

public class banggwahoo13 {
    static void main(String[] args) {
        foo("안녕", 1);
        foo("안녕하세요",1,2,3,3,3,3,33,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
        foo("잘있어");
    }

    static void foo(String i, int...v){//...v를 쓰면 일일히 변수지정을 안해주어도 된다!!!
        System.out.print(i);
        for (int n = 0; n < v.length; n++) {//lengh를 써서 배열의 크기만큼 반복해준다!!!!!!
            System.out.print(v[n]+" ");

        }
    }
}
