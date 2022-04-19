package com.syntax.homework;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardTest {
    public static void main(String[] args) {

        Card visa = new Visa("credit");
        Card master = new MasterCard("debit");
        Card amex = new AMEX("credit");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(visa);
        cards.add(master);
        cards.add(amex);
        for (Card c : cards) {
            c.cancelled();
            c.isActivated();
            c.limit();
        }
        System.out.println("******************");
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).cancelled();
            cards.get(i).isActivated();
            cards.get(i).limit();
        }
        System.out.println("********************");

        ListIterator<Card> iter = cards.listIterator();
        while (iter.hasNext()) {
          Card s = iter.next();
        s.cancelled();
        s.isActivated();
        s.limit();



        }
    }
}
