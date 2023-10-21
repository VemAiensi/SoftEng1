package adapters;

import adaptees.SmartPhoneCharger;

public class SmartPhoneAdapter implements PowerOutlet{
    private SmartPhoneCharger phoneCharger;

    public SmartPhoneAdapter(SmartPhoneCharger phoneCharger)
    {
        this.phoneCharger = phoneCharger;
    }
    @Override
    public String plugIn() {
        return phoneCharger.chargePhone();
    }
}
