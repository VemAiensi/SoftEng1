import devices.*;

import java.util.Scanner;

public class SmartHomeApp {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("---[ Command Pattern ]---\n" +
                "by Marasigan, Vem Aiensi : 3BSCS-1");



        int choice = 0;
        while (choice<2 && choice>-1)
        {
            System.out.print("\n[1] Manual Control    [2] Remotely thru Control Hub    [3] Exit" +
                    "\nChoose mode of control: ");
            choice = in.nextInt();

            if(choice==1)
            {//[Manual] This accesses functions directly
                while (choice<5 && choice>0)
                {
                    choice = manualControl();;
                }

            }
            else if(choice==2)
            {//[Control hub] This accesses functions thru DeviceController
                while (choice<5 && choice>0)
                {
                    choice = remoteControl();
                }
            }
        }
        System.out.println("\n\n--Thank you for your patience--");

    }

    public static int manualControl(){
        int choice;
        System.out.print("\n\n[1] Aircon     [2] Music Player \n[3] Thermostat [4] Light \n" +
                "       [0] Return\n" +
                "Where do you want to go?  ");
        choice = in.nextInt();
        if(choice == 0)
            return choice;

        Device device = chooseDevice(choice);

        while(choice != 0)
        {
            System.out.print("\n[1] On   [2] Off\n[3] Up   [4] Down\n" +
                    "      [0] Return" +
                    "\nPress Button: ");
            choice = in.nextInt();
            if(choice == 0)
                manualControl();

            switch(choice)
            {
                case 1: System.out.println(device.turnOn()); break;
                case 2: System.out.println(device.turnOff()); break;
                case 3: System.out.println(device.increase()); break;
                case 4: System.out.println(device.decrease()); break;
            }
        }

        return choice;
    }
    public static int remoteControl(){
        DeviceController app = new DeviceController();
        int choice;

        System.out.print("\n\n[1] Aircon     [2] Music Player \n[3] Thermostat [4] Light \n" +
                "       [0] Back\n" +
                "Please choose device to control: ");
        choice = in.nextInt();
        if(choice == 0)
            return choice;

        Device device = chooseDevice(choice);

        while (choice !=0)
        {
            System.out.print("\n[1] On   [2] Off\n[3] Up   [4] Down\n" +
                    "      [0] Back" +
                    "\nPress Button: ");
            choice = in.nextInt();

            if(choice == 0)
                remoteControl();
            else
                clickButton(choice, device, app);
        }
        return choice;
    }
    public static Device chooseDevice(int choice)
    {
        Device device = null;
        switch (choice)
        {
            case 1: device = new Aircon(); break;
            case 2: device = new MusicPlayer(); break;
            case 3: device = new Thermostat(); break;
            case 4: device = new Light(); break;
        }
        return device;
    }
    public static void clickButton(int choice, Device device, DeviceController app)
    {
        switch (choice)
        {
            case 1: System.out.println(device.getClass().getSimpleName() + ": " + app.clickOn(device)); break;
            case 2: System.out.println(device.getClass().getSimpleName() + ": " + app.clickOff(device)); break;
            case 3: System.out.println(device.getClass().getSimpleName() + ": " + app.clickPlus(device)); break;
            case 4: System.out.println(device.getClass().getSimpleName() + ": " + app.clickMinus(device)); break;
        }
    }
}