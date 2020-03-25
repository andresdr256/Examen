package oop.inheritance.verifone.v240m;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.tpv.CardSwipper;

public class VerifoneV240mCardSwipper implements CardSwipper {

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
