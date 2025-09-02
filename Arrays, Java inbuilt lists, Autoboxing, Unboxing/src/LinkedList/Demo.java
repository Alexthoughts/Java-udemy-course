package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        //add the cities in alphabet order
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Kyiv");
        addInOrder(placesToVisit,"ZP");
        addInOrder(placesToVisit,"Prague");
        printList(placesToVisit);

        visit(placesToVisit);

//        placesToVisit.add(1, "Dnepr");
//        //добавили город на поизицию 1, будет между Sydney и Melbourne
//        printList(placesToVisit);
//
//        placesToVisit.remove(0); //Dnepr will be the first
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        //another way to print a list (such as for)
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("visit " + i.next());
        }
        System.out.println("------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); //create iterator

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); //to go to the 1 record
            //compareTo return: 0(равны)/>0(existing city B, new city A)/<0(existing city A, new city B)
            if (comparison == 0) {
                //equal, do not add
                System.out.println((newCity + " is already included"));
                return false;
            } else if (comparison > 0) {
                //new City should appear before existing
                //надо взять предыдущий, потому что stringListIterator.next() уже берет следующий
                stringListIterator.previous(); //back to previous record, добавили перед имеющимся словом
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on next city
                //automaticly go to next (stringListIterator.next())
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; //direction (смотрим следующий или предыдущий город)
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case 1: //next city
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false; //because end of the list
                    }
                    break;

                case 2: //previous city
                    if (goingForward) { //без этого будет поторятся город который мы уже смотрели
                        if (listIterator.hasPrevious()){
                            listIterator.previous();// возращаемся на предыдущийS
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true; //because it is start of the list
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - quit \n" +
                "1 - next city \n" +
                "2 - previous city \n" +
                "3 - print menu");
    }
}
