package oop.inheritance.tpv;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import oop.inheritance.data.CommunicationType;
import oop.inheritance.ingenico.IngenicoCardSwipper;
import oop.inheritance.ingenico.IngenicoChipReader;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.ingenico.IngenicoEthernet;
import oop.inheritance.ingenico.IngenicoGPS;
import oop.inheritance.ingenico.IngenicoKeyboard;
import oop.inheritance.ingenico.IngenicoModem;

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

    @Override
    public Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap() {
        Map<CommunicationType, CommunicationDevice> communicationDeviceEnumMap = new HashMap<>();

        communicationDeviceEnumMap.put(CommunicationType.ETHERNET, new IngenicoEthernet());
        communicationDeviceEnumMap.put(CommunicationType.GPS, new IngenicoGPS());
        communicationDeviceEnumMap.put(CommunicationType.MODEM, new IngenicoModem());

        return communicationDeviceEnumMap;
    }
}