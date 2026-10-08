package sec07;

class Chess{
    enum ChessPlayer{
        WHITE, BLACK
    }

    final ChessPlayer getFirstPlayer(){return ChessPlayer.WHITE;}//final 오버라이딩 금지 시킬수 있다.
}

class WorldChess extends Chess{
    //ChessPlayer getFirstPlayer(){}
}

public class FinalMaethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }
}
