public class QueueMonitoring {
    public static void main(String[] args){
        //Creeation of 3 help desk
        HelpDesk hD1 = new HelpDesk("Help Desk 1").getInstance("Help Desk 1");
        HelpDesk hD2 = new HelpDesk("Help Desk 2").getInstance("Help Desk 2");
        HelpDesk hD3 = new HelpDesk("Help Desk 3").getInstance("Help Desk 3");

        System.out.println("\t\t-Welcome to Pag-ibig Office-");
        System.out.println("Feel free to inquire in our in our available Help Desks\n");

        //process an individual at help desk 1
        hD1.process(new Individual("Vem"));

        //process an individual at help desk 2
        hD2.process(new Individual("Syd"));

        //process an individual at help desk 3
        hD3.process(new Individual("Ronnie"));

        //a group of people went at help desk 1
        hD1.process(new Individual("Emman"));
        hD1.process(new Individual("Angelo"));
        hD1.process(new Individual("Ian"));

        //an individual along with his gf decided to 
        //split in help desks with short queue
        hD2.process(new Individual("Earl"));
        hD3.process(new Individual("Dina"));

        //queue monitor checked the queue of all help Desks
        hD1.displayQueue();
        hD2.displayQueue();
        hD3.displayQueue();

        //2 indviduals finished their transaction at help desk 2 and 3
        hD2.endProcess();
        hD3.endProcess();

        //emman along with his friends decided to 
        //split in different available helpdesk
        //because the individual in help desk 1 is taking too long
        hD2.process(new Individual("Emman"));
        hD2.process(new Individual("Ian"));
        hD3.process(new Individual("Angelo"));

        //queue monitor checked the queue of all help Desks
        hD1.displayQueue();
        hD2.displayQueue();
        hD3.displayQueue();

        //the monitor saw the there were queue changes as
        //individuals went to other help desks
        //then decides to reset the queue in help desk 1
        hD1.resetQueue();

        //queue monitor checked the queue of all help Desks
        hD1.displayQueue();
        hD2.displayQueue();
        hD3.displayQueue();

        //inquiries are processed fast in most of the help desk
        hD2.endProcess();
        hD3.endProcess();
        hD2.endProcess();
        hD3.endProcess();
        hD2.endProcess();

        //Vem finished his inquiry but was still disappointed
        hD1.endProcess();

        System.out.println("\n\t-------[ Singleton Pattern ]-------\n" +
                "\tby Marasigan, Vem Aiensi : 3BSCS-1\n");
    }
    
}
