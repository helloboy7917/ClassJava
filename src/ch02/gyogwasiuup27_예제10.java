package ch02;

public class gyogwasiuup27_예제10 {
    public static void main(String[] args) {
        Pokemon inbentori = new Pokemon("피카츄");
        inbentori.setType("전기타입").setLevel("레벨 25").learnSkill("백만볼트").attack("효과는 굉장했다!!").printhagi();

    }
}

class Pokemon{
    String setType;
    String setLevel;
    String learnSkill;
    String attack;
    String name;

    public Pokemon(String name){
        this.name= name;
    }
    public Pokemon setLevel(String setLevel){
        this.setLevel= setLevel;
        return this;
    }
    public Pokemon learnSkill(String learnSkill){
        this.learnSkill= learnSkill;
        return this;
    }
    public Pokemon setType(String setType){
        this.setType= setType;
        return this;
    }
    public Pokemon attack(String attack){
        this.attack=attack;
        return this;
    }
    public void printhagi(){
        System.out.println("가라 피카츄 ("+setLevel+","+setType+")");
        System.out.println("피카츄의 ["+learnSkill+"]");
        System.out.println(attack);
    }

}