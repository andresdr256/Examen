package oop.inheritance.tpv;

import java.util.HashMap;
import java.util.Map;
import oop.inheritance.data.CommunicationType;
import oop.inheritance.verifone.v240m.VerifoneV240mCardSwipper;
import oop.inheritance.verifone.v240m.VerifoneV240mChipReader;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mEthernet;
import oop.inheritance.verifone.v240m.VerifoneV240mGPS;
import oop.inheritance.verifone.v240m.VerifoneV240mKeyboard;
import oop.inheritance.verifone.v240m.VerifoneV240mModem;


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

    @Override
    public Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap() {
        Map<CommunicationType, CommunicationDevice> communicationDeviceEnumMap = new HashMap<>();

        communicationDeviceEnumMap.put(CommunicationType.ETHERNET, new VerifoneV240mEthernet());
        communicationDeviceEnumMap.put(CommunicationType.GPS, new VerifoneV240mGPS());
        communicationDeviceEnumMap.put(CommunicationType.MODEM, new VerifoneV240mModem());

        return communicationDeviceEnumMap;
    }
}