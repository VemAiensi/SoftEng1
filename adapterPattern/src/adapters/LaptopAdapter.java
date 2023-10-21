package adapters;

import adaptees.Laptop;

public class LaptopAdapter implements PowerOutlet{
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop)
    {
        this.laptop = laptop;
    }


    @Override
    public String plugIn() {
        return laptop.charge();
    }
}
