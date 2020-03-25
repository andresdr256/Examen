package oop.inheritance.tpv;

import oop.inheritance.ingenico.IngenicoCardSwipper;
import oop.inheritance.ingenico.IngenicoChipReader;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.ingenico.IngenicoKeyboard;

public class IngenicoTPVFactory extends AbstractTPVFactory {


    @Override
    public CardSwipper getCardSwipper() {
        return new IngenicoCardSwipper();
    }

    @Override
    public ChipReader getChipReader() {
        return new IngenicoChipReader();
    }

    @Override
    public Display getDisplay() {
        return IngenicoDisplay.getInstance();
    }

    @Override
    public Keyboard getKeyboard() {
        return new IngenicoKeyboard();
    }
}