package blackjack;

import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT = 2;

    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();

        initPhase(cd, dealer, gamer);
        playPhase(cd, dealer, gamer);
    }

    private static void initPhase(CardDeck cd, Dealer dealer, Gamer gamer){
        for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++){
            dealer.receiveCard(cd.getCard());
            gamer.receiveCard(cd.getCard());
        }
        // 딜러가 가진 카드의 점수가 17 미만이면 한장 더 받아야 함
        if (dealer.needMoreCard()){
            dealer.receiveCard(cd.getCard());
        }
    }

    private static void playPhase(CardDeck cd, Dealer dealer, Gamer gamer) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            gamer.showCards();
            System.out.print("카드를 더 뽑겠습니까?(종료:0) >>");
            String answer = scanner.next();
            if ("0".equals(answer)) {
                break;
            }
            gamer.receiveCard(cd.getCard());
        }
        System.out.println(Rule.getScore(gamer.openCards()));
        Rule.getWinner(dealer, gamer);
        System.out.println("딜러 카드: ");
        dealer.showCards();
        System.out.println(Rule.getScore(dealer.openCards()));

        scanner.close();
    }
}
