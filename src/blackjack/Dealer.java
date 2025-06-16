package blackjack;

import java.util.List;

public class Dealer extends Gamer{
    private final static int CAN_RECEIVE_POIMT = 16;

    public boolean needMoreCard(){
        int score = Rule.getScore(this.openCards());
//        if ( score < CAN_RECEIVE_POIMT ) return true;
//        else return false;
        return (score < CAN_RECEIVE_POIMT); // 매직 넘버
    }
}
