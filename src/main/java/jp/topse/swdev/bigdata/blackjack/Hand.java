package jp.topse.swdev.bigdata.blackjack;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by doi on 2017/09/26.
 */
public class Hand {

    private List<Card> cards = new LinkedList<Card>();

    public void add(Card card) {
        cards.add(card);
    }

    public Card get(int index) {
        return cards.get(index);
    }

    public int eval() {
        return cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (sum, n) -> sum + n);
    }
}
