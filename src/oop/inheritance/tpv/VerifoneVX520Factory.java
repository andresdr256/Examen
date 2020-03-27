package oop.inheritance.tpv;

import java.util.HashMap;
import java.util.Map;
import oop.inheritance.data.CommunicationType;
import oop.inheritance.verifone.vx520.VerifoneVx520CardSwipper;
import oop.inheritance.verifone.vx520.VerifoneVx520ChipReader;
import oop.inheritance.verifone.vx520.VerifoneVx520Display;
import oop.inheritance.verifone.vx520.VerifoneVx520Ethernet;
import oop.inheritance.verifone.vx520.VerifoneVx520GPS;
import oop.inheritance.verifone.vx520.VerifoneVx520Keyboard;
import oop.inheritance.verifone.vx520.VerifoneVx520Modem;


public class VerifoneVX520Factory extends AbstractTPVFactory {

    @Override
    public CardSwipper getCardSwipper() {
        return new VerifoneVx520CardSwipper();
    }

    @Override
    public ChipReader getChipReader() {
        return new VerifoneVx520ChipReader();
    }

    @Override
    public Display getDisplay() {
        return new VerifoneVx520Display();
    }

    @Override
    public Keyboard getKeyboard() {
        return new VerifoneVx520Keyboard();
    }

    @Override
    public Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap() {
        Map<CommunicationType, CommunicationDevice> communicationDeviceEnumMap = new HashMap<>();

        communicationDeviceEnumMap.put(CommunicationType.ETHERNET, new VerifoneVx520Ethernet());
        communicationDeviceEnumMap.put(CommunicationType.GPS, new VerifoneVx520GPS());
        communicationDeviceEnumMap.put(CommunicationType.MODEM, new VerifoneVx520Modem());

        return communicationDeviceEnumMap;
    }
}