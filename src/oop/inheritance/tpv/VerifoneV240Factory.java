package oop.inheritance.tpv;

import oop.inheritance.verifone.v240m.VerifoneV240mCardSwipper;
import oop.inheritance.verifone.v240m.VerifoneV240mChipReader;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mKeyboard;

public class VerifoneV240Factory extends AbstractTPVFactory {

    @Override
    public CardSwipper getCardSwipper() {
        return new VerifoneV240mCardSwipper();
    }

    @Override
    public ChipReader getChipReader() {
        return new VerifoneV240mChipReader();
    }

    @Override
    public Display getDisplay() {
        return new VerifoneV240mDisplay();
    }

    @Override
    public Keyboard getKeyboard() {
        return new VerifoneV240mKeyboard();
    }
}