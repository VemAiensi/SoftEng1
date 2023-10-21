package adapters;

import adaptees.Refrigerator;

public class RefrigeratotAdapter implements PowerOutlet{
    private Refrigerator ref;

    public RefrigeratotAdapter(Refrigerator ref)
    {
        this.ref = ref;
    }
    @Override
    public String plugIn() {
        return ref.startCooling();
    }
}
