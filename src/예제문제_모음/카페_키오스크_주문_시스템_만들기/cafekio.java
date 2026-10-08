//열거형(Enum)과 Scanner, 그리고 while문을 활용하여 카페 키오스크 프로그램을 완성하세요.
//요구사항 명세서
//1단계: 열거형 CoffeeMenu 만들기
//우리 카페의 메뉴는 딱 3가지입니다.
//AMERICANO (4000원)
//LATTE (4500원)
//MOCHA (5000원)
//각 메뉴가 자신의 '가격(price)' 데이터를 품도록 필드와 생성자를 만드세요.외부에서 가격을 조회할 수 있도록 getPrice() 메서드를 만드세요.
//        2단계: 안전한 변환 메서드 만들기 (CoffeeMenu 내부)
//다음과 같은 헬퍼 메서드를 만드세요:
//public static CoffeeMenu fromUserInput(String input)
//사용자가 입력한 문자열을 바탕으로 일치하는 Enum 객체를 찾아 반환하세요.단, 사용자가 소문자로 입력하거나 공백을 넣어도(" americano ") 찾을 수 있어야 합니다.메뉴에 없는 값을 입력하면 에러를 던지지 말고 null을 반환하세요.
//3단계: 메인 로직 만들기 (CafeKiosk 클래스)
//Scanner를 사용하여 사용자에게 입력을 받습니다.
//올바른 메뉴를 입력할 때까지 계속 다시 물어봐야 합니다.
//fromUserInput() 메서드를 호출하여 입력값을 검증하세요.
//성공 시: 루프를 탈출(break)하고 최종 결제 금액을 출력하세요.
//실패 시 (null일 경우): 에러 메시지를 띄우고 루프의 처음으로 돌아가 다시 물어보세요.
package 예제문제_모음.카페_키오스크_주문_시스템_만들기;

public class cafekio {
    int americano = 4000;
    int latte = 4500;
    int mocha = 5000;

    public int getAmericano() {
        return americano;
    }

    public int getLatte() {
        return latte;
    }

    public int getMocha() {
        return mocha;
    }

    public cafekio(int americano, int latte, int mocha) {
        this.americano = americano;
        this.latte = latte;
        this.mocha = mocha;
    }

}
