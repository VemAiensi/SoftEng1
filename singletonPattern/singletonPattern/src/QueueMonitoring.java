import java.util.ArrayList;

public class QueueMonitoring {
    public static void main(String[] args){

        //Creeation of 3 help desk
        HelpDesk hD1 = new HelpDesk("Help Desk 1");
        HelpDesk hD2 = new HelpDesk("Help Desk 2");
        HelpDesk hD3 = new HelpDesk("Help Desk 3");
        ArrayList <HelpDesk> helpDesks = new ArrayList<>();
        helpDesks.add(hD1);
        helpDesks.add(hD2);
        helpDesks.add(hD3);

        //Queue
        Queue queue = Queue.getInstance();
        queue.enQueue(new Individual("Vem"));
        queue.enQueue(new Individual("Syd"));
        queue.enQueue(new Individual("Ronnie"));
        queue.enQueue(new Individual("Emman"));
        queue.enQueue(new Individual("AC"));
        queue.enQueue(new Individual("Earl"));


        System.out.println("\t\t-Welcome to Pag-ibig Office-");
        System.out.println("Feel free to inquire in our in our available Help Desks\n");

        //process an individual at help desk 1
        helpDesks.get(0).process(queue.process());

        //process an individual at help desk 2
        helpDesks.get(1).process(queue.process());

        //process an individual at help desk 3
        helpDesks.get(2).process(queue.process());


        //queue monitor checked the queue
        queue.displayQueue(helpDesks);

        //end process of an individual at help desk 1
        helpDesks.get(0).endProcess();

        //end process of an individual at help desk 2
        helpDesks.get(1).endProcess();

        //end process of an individual at help desk 3
        helpDesks.get(2).endProcess();


        queue.displayQueue(helpDesks);

        //process an individual at help desk 1
        helpDesks.get(0).process(queue.process());

        //process an individual at help desk 2
        helpDesks.get(1).process(queue.process());

        //process an individual at help desk 3
        helpDesks.get(2).process(queue.process());

        queue.displayQueue(helpDesks);

        //sample problem: the queue was not updated
        queue.enQueue(new Individual("Vem"));
        queue.enQueue(new Individual("Syd"));
        queue.enQueue(new Individual("Ronnie"));
        queue.enQueue(new Individual("Emman"));
        queue.enQueue(new Individual("AC"));
        queue.enQueue(new Individual("Earl"));
        queue.displayQueue(helpDesks);

        //reseting the queue
        queue.resetQueue();

        //test if it works
        queue.displayQueue(helpDesks);

        //end process of an individual at help desk 1
        helpDesks.get(0).endProcess();

        //end process of an individual at help desk 2
        helpDesks.get(1).endProcess();

        //end process of an individual at help desk 3
        helpDesks.get(2).endProcess();

        queue.displayQueue(helpDesks);
        
        System.out.println("\n\t-------[ Singleton Pattern ]-------\n" +
                "\tby Marasigan, Vem Aiensi : 3BSCS-1\n");
    }
    
}
