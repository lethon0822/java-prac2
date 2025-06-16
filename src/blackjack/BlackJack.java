package blackjack;

import java.util.List;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //cd.printAllCards();
        Card c = cd.getCard();
        System.out.println(c);
        System.out.println(cd.getCard());
        System.out.println(cd.getCard());

        System.out.println("-----------------------");
//        cd.printAllCards();

        System.out.println("------------게이머-----------");
        Gamer gamer = new Gamer();
        gamer.receiveCard(c);
        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());
        gamer.showCards();

        List<Card> cards = gamer.openCards();
        int score = Rule.getScore(cards);
        System.out.println(score);

        System.out.println("-----------딜러------------");
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());
//        dealer.showCards();

        if (dealer.needMoreCard()) {
            dealer.receiveCard(cd.getCard());
        }
        dealer.showCards();
        System.out.println(Rule.getScore(dealer.openCards()));

        Rule.getWinner(dealer, gamer);
    }
}
