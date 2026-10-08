package ch02.sec07;

class good {
}

class Better extends good{
}

final class Best extends Better{
}
//class NumberOne extends Best

public class finalClassDemo{
    static void main(String[] args) {
        // new NumberOne();
        new Best();
    }
}
