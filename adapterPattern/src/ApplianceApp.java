import adaptees.*;
import adapters.*;
import java.util.Scanner;

public class ApplianceApp
{
    public static void main(String[] args)
    {
        System.out.println("---[ Adapter Pattern ]---\n");

        Laptop laptop = new Laptop();
        LaptopAdapter lptAdpt = new LaptopAdapter(laptop);

        Refrigerator ref = new Refrigerator();
        RefrigeratotAdapter refAdpt = new RefrigeratotAdapter(ref);

        SmartPhoneCharger sCharger = new SmartPhoneCharger();
        SmartPhoneAdapter scAdpt = new SmartPhoneAdapter(sCharger);

        Scanner in = new Scanner(System.in);
        int choice;

        while (true)
        {
            System.out.print("[1] Laptop\t\t[2] Refrigerator\n[3] Smart Phone\t[4] Exit" +
                    "\nChoose a device to Plug-in: ");
            choice = in.nextInt();
            switch (choice){
                case 1: System.out.println(lptAdpt.plugIn()+"\n"); break;
                case 2: System.out.println(refAdpt.plugIn()+"\n"); break;
                case 3: System.out.println(scAdpt.plugIn()+"\n"); break;
                case 4: System.out.println("-------[ Adapter Pattern ]-------\n" +
                        "by Marasigan, Vem Aiensi : 3BSCS-1"); System.exit(1);
                default: System.out.println("Invalid input"); break;
            }
        }
    }
}
