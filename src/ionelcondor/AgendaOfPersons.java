package ionelcondor;

/**
 * Created by condor on 07/11/15.
 */

import java.util.Scanner;

public class AgendaOfPersons {

    private Person[] nameAgenda = new Person[50];
    private int index=0;

    public static void main(String[] args) {
        System.out.println("AgendaTa versiunea 2.0");
        AgendaOfPersons m = new AgendaOfPersons();

        do {
            m.printMenu(); // afisseaza optiuni
            int option = 0;
            option = m.readMenuOption(); // citste optiunea
            switch (option) {
                case 1:
                    m.listAgenda();
                    break;
                case 2:
                    m.searchAgendaAndDisplay();
                    break;
                case 3:
                    m.createItem();
                    break;
                case 4:
                    m.updateItem();
                    break;
                case 5:
                    m.deleteItem();
                    break;
                case 6:
                    m.daBunaZiua();
                    break;

                case 9:
                    m.exitOption();
                    break;
                default:
                    m.defaultOption();
                    break;
            }
        } while (true);

    }


    private void printMenu() {
        System.out.println("1. List");
        System.out.println("2. Search");
        System.out.println("3. Create");
        System.out.println("4. Update");
        System.out.println("5. Delete");
        System.out.println("6. Da buna ziua");

        System.out.println("9. Exit");
    }

    private void exitOption() {
        System.out.println("Bye, bye...the content not saved will now be erased");
        System.exit(0);
    }

    private void defaultOption() {
        System.out.println("This option does not exist. Pls take another option");
    }

    private String readAString(String label) {
        Scanner s = new Scanner(System.in);
        System.out.print(label);
        String name = s.nextLine();
        return name;
    }

    private int readMenuOption() {
        Scanner s = new Scanner(System.in);
        System.out.print("Option: ");
        int option = s.nextInt();
        return option;
    }


    private void daBunaZiua() {
        System.out.println("buna ziua");
    }

    private void createItem() {
        //String val = readName();

        Person val = new Person();

        String name = readAString("Name");
        String phone = readAString("Phone");
        val.setName(name);
        val.setPhone(phone);

        if (index < nameAgenda.length) {
            nameAgenda[index] = val;
            index++;
        }else{
            System.out.println("debug");
            for (int i = 0; i < nameAgenda.length; i++) {
                if (nameAgenda[i] == null) {

                    nameAgenda[i] = val;
                    System.out.println("Am introdus numele intr-un slot null");
                    break;

                }
        }



        }

    }


    private void updateItem() {
/*
        //search and if found do an update
        boolean isFound=false;
        String oldName = readName();

        for(int i=0; i<nameAgenda.length; i++ ) {
            if (nameAgenda[i]!=null){
                if(nameAgenda[i].equals(oldName)){
                    System.out.println("Introdu numele");
                    String newName = readName();
                    nameAgenda[i] = newName;
                    isFound=true;
                    System.out.println("Am schimbat");
                }
            }
        }
        if(!isFound)
          System.out.println("Numele nu a fost gasit");
*/
    }


    private void deleteItem() {
      /*  boolean isFound=false;
        String oldName = readAString();

        for(int i=0; i<nameAgenda.length; i++ ) {
            if (nameAgenda[i]!=null){
                if(nameAgenda[i].equals(oldName)){
                    nameAgenda[i]=null;
                    System.out.println("Nu mai exista");

                }
            }
        }
        if(!isFound)
            System.out.println("Numele nu a fost gasit");
*/
    }


    /* returns the index where the name was found or -1 if the name is not in the agenda*/
    private int searchAgenda() {
        int index = 0;
        return index;
    }

    /* returns the index where the name was found or -1 if the name is not in the agenda */
    private void searchAgendaAndDisplay() {
/*
        boolean isFound=false;
        String oldName = readName();

        for(int i=0; i<nameAgenda.length; i++ ) {
            if (nameAgenda[i]!=null){
                if(nameAgenda[i].equals(oldName)){


                }

            }

        }
        if(!isFound)
            System.out.println("Numele nu a fost gasit");
*/
    }


    private void listAgenda() {
        System.out.println("aici as lista agenda");
        int counter = 0;
        for (int i = 0; i < nameAgenda.length; i++) {
           if (nameAgenda[i] != null) {
               Person p = nameAgenda[i];
                System.out.println(p.getName());
                System.out.println(p.getPhone());

                counter++;
            }
        }
        if (counter == 0)
            System.out.println("Agenda este goala");

    }
}