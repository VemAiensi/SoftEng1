import java.util.*;

public class PSE {
    public static void main(String[] args){

        String choice = "";
        Scanner scan = new Scanner(System.in);

        NewsAgency eagleNews = new NewsAgency();

        System.out.println("\t\t-[Welcome to News Agency]-");

        do{
            System.out.print("\n[1] Publish News   [2] Modify Subscribers   \n[3] Cancel         CHOICE: ");
            choice = scan.nextLine();
            switch (choice)
            {
                case "1": do{
                            System.out.println("\nEnter news headline: ");
                            String headline = scan.nextLine();
                            System.out.println("What is the overview?");
                            String overview = scan.nextLine();

                            System.out.print("\nWould you like to publish and\n notify subscribers? [Y/N]: ");
                            if(scan.nextLine().equals("Y")){
                                System.out.println("\nPublishing news updates!\n");
                                eagleNews.setNewsHeadline(headline);
                                eagleNews.setNewsOverview(overview);
                                eagleNews.notifySubscribers();
                            }
                            else{
                                break;
                            }
                        }while(choice.equals("Y"));
                        break;
                        
                case "2": do {
                            System.out.print("\n[1] Attatch subscribers  [2] Detatch Subscribers\n"+
                                                 "[3] Show List            [4] Back          CHOICE: ");
                            choice = scan.nextLine();
                            switch (choice) 
                            {
                                case "1": System.out.print("\nPlease enter your name: ");
                                            Subscriber subscriber = new Subscriber(scan.nextLine());
                                            eagleNews.attatch(subscriber);
                                            break;
                                case "2": showList(eagleNews.getSubscribers());
                                            System.out.print("\nPlease type the number corresponding to the \nsubscriber you want to remove: ");
                                            eagleNews.detatch(eagleNews.getSubscribers().get(Integer.parseInt(scan.nextLine())-1));
                                            break;
                                case "3": showList(eagleNews.getSubscribers());
                                            break;
                            }
                            if (choice.equals("4"))
                                break;
                        }while(true);
                        break;
                case "3": break;
            }

            if(choice.equals("3"))
                break;

        }while(true);

        System.out.println("\t-------[ Observer Pattern ]-------\n" +
                        "\tby Marasigan, Vem Aiensi : 3BSCS-1");
    }

    static void showList(List<Subscriber> subscribers){
        System.out.println("\n-Subscriber List-");
        int num = 1;
        for(Subscriber subscriber : subscribers ){
            System.out.println("[" + num + "] " + subscriber.getSubscriberName());
            num++;
        }
    }
}

