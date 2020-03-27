package oop.inheritance.tpv;

import java.util.HashMap;
import java.util.Map;
import oop.inheritance.data.CommunicationType;
import oop.inheritance.verifone.vx690.VerifoneVx690CardSwipper;
import oop.inheritance.verifone.vx690.VerifoneVx690ChipReader;
import oop.inheritance.verifone.vx690.VerifoneVx690Display;
import oop.inheritance.verifone.vx690.VerifoneVx690Ethernet;
import oop.inheritance.verifone.vx690.VerifoneVx690GPS;
import oop.inheritance.verifone.vx690.VerifoneVx690Keyboard;
import oop.inheritance.verifone.vx690.VerifoneVx690Modem;


public class VerifoneVX690Factory extends AbstractTPVFactory {

    @Override
    public CardSwipper getCardSwipper() {
        return new VerifoneVx690CardSwipper();
    }

    @Override
    public ChipReader getChipReader() {
        return new VerifoneVx690ChipReader();
    }

    @Override
    public Display getDisplay() {
        return new VerifoneVx690Display();
    }

    @Override
    public Keyboard getKeyboard() {
        return new VerifoneVx690Keyboard();
    }

    @Override
    public Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap() {
        Map<CommunicationType, CommunicationDevice> communicationDeviceEnumMap = new HashMap<>();

        communicationDeviceEnumMap.put(CommunicationType.ETHERNET, new VerifoneVx690Ethernet());
        communicationDeviceEnumMap.put(CommunicationType.GPS, new VerifoneVx690GPS());
        communicationDeviceEnumMap.put(CommunicationType.MODEM, new VerifoneVx690Modem());

        return communicationDeviceEnumMap;
    }
}