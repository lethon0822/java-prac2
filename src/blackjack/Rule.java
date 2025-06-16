package blackjack;

import java.util.List;

public class Rule {
    public static int getScore(List<Card> cards) {
        int sum = 0;
        for (Card card : cards){
            int score = convertDenominationToScore(card.getDenomination());
            sum += score;
        }
        return sum;
    }

    public static int convertDenominationToScore(String denomination){
        return switch (denomination) {
            case "A" -> 1;
            case "J", "Q", "K" ->  10;
            default -> Integer.parseInt(denomination);
        };
    }

    public static void getWinner(Dealer dealer, Gamer gamer) {
        // 경우의 수 6가지
        // 1. 둘 다 21점 초과 >> 비김
        // 2. 둘 다 21점 이하지만 점수가 같음 >> 비김
        // 3. 딜러의 점수가 21점 초과, 게이머의 점수가 21점 이하 >> 게이머 승
        // 4. 둘 다 21점 이하지만 게이머의 점수가 더 높음 >> 게이머 승
        // 5. 게이머의 점수가 21점 초과, 딜러의 점수가 21점 이하 >> 딜러 승
        // 6. 둘 다 21점 이하지만 게이머의 점수가 더 높음 >> 딜러 승

        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());
        if (dealerScore == gamerScore){
            System.out.println("무승부");
        } else if (dealerScore > 21) {
            System.out.println(gamerScore > 21 ? "무승부" : "게이머 승!");
        } else if (gamerScore > 21) {
            System.out.println(dealerScore > 21 ? "무승부" : "딜러 승!");
        } else {
            System.out.println(dealerScore > gamerScore ? "딜러 승!" : "게이머 승!");
        }
    }
}
