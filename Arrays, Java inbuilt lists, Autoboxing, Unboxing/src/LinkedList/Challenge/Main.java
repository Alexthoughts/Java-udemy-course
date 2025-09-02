package LinkedList.Challenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);
   private static Album album = new Album("New album");
    public static void main(String[] args) {
        album.addSong("Song1", 2.53);
        album.addSong("Song2", 3.86);
        album.addSong("Song3", 2.12);
        album.addSong("Song4", 4.01);
        album.addSong("Song5", 3.54);
        album.addSong("Song6", 3.47);


        LinkedList<Song> playList = new LinkedList<>();
        LinkedList<Song> playList2 = new LinkedList<>();
        album.addToPlayList("Song1", playList);
        album.addToPlayList("Song2", playList);
        album.addToPlayList("Song3", playList);
        album.addToPlayList("Song4", playList);
        album.addToPlayList("Song5", playList2);
        album.addToPlayList("Song6", playList2);

        chooseTheAction(playList);





    }

    private static void printMenu() {
        System.out.println("Press the button: \n" +
                "1 - next song \n" +
                "2 - previous song \n" +
                "3 - replay the song \n" +
                "4 - remove the song\n" +
                "5 - show songs in the playlist\n" +
                "6 - quit");
    }

    private static void chooseTheAction(LinkedList<Song> playList) {
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList == null) {
            System.out.println("empty play list");
        }
        printMenu();

        while (!quit) {
            System.out.println("Choose the action");
            int action = scanner.nextInt();
            if (action > 0 && action < 7) {
                switch (action) {
                    case 1:
                        if (!goingForward) {
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                            goingForward = true;
                        }
                        if (listIterator.hasNext()) {
                            System.out.println(listIterator.next());
                        } else {
                            System.out.println("It is last song");
                            goingForward = false;
                        }
                        break;
                    case 2:
                        if (goingForward) {
                            if (listIterator.hasPrevious()) ;
                            listIterator.previous();
                        }
                        if (listIterator.hasPrevious()) {
                            System.out.println(listIterator.previous());
                            goingForward = false;
                        } else {
                            System.out.println("It is the first song");
                            goingForward = true;
                        }
                        break;
                    case 3:
                        if (listIterator.hasPrevious() || listIterator.hasNext()) {
                            listIterator.previous();
                            System.out.println(listIterator.next());
                        } else {
                            System.out.println("It is first/last song");
                        }
                        break;
                    case 4:
                        listIterator.remove();
                        System.out.println(listIterator.next() + " removed");
                        break;
                    case 5:
                        printSongsInPlaylist(playList);
                        break;
                    case 6:
                        quit = true;
                        System.out.println("quit");
                }
            } else {
                System.out.println("Please choose the action");
                printMenu();
            }
        }
    }

    private static void printSongsInPlaylist(LinkedList<Song> playList) {
        Iterator<Song> i = playList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
