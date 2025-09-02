package Switch;

public class Switch {
    public static void main(String[] args) {
        char abcde = 'a';
        switch(abcde){
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            case 'c': case 'd': case 'e':
                System.out.println("Char is " + abcde);
                break;
            default:
                System.out.println("Not abcde");
                break;
        }
    }

}
