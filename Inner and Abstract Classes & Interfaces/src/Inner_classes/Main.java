package Inner_classes;

import java.util.Scanner;

public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//    private static Button button = new Button("Print");

    public static void main(String[] args) {
        Gearbox accord = new Gearbox(6);
//        Gearbox.Gear first = accord.new Gear(1, 12.3);
//        Gearbox.Gear second = accord.new Gear(2, 15.4);
//        System.out.println(first.driveSpeed(2500));
//        System.out.println(second.driveSpeed(2000));
//        accord.addGear(1,5.3); передачи добавили в конструктор,
//        после ввода maxGears автоматически создадим столько передач
//        accord.addGear(2, 10.6);
//        accord.operateClutch(true);
        accord.changeGear(1);
        accord.operateClutch(false);
        accord.changeGear(2);
        accord.operateClutch(true);
        accord.changeGear(3);

//class ClickListener implements Button.OnClickListener {
//    public ClickListener() {
//        System.out.println("I've been attached");
//    }
//
//    @Override
//    public void onClick(String title) {
//        System.out.println(title + " was clicked");
//    }
//}
//button.setOnClickerListener(new ClickListener());
//listen();
//    }
//    private static void listen() {
//        boolean quit = false;
//        while (!quit) {
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    button.onClick();
//            }
//        }
    }
}
