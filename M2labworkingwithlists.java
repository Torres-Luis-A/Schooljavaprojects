import java.util.*;

public class M2labworkingwithlists {

    private static LinkedList<String> Rainbowlist = new LinkedList<>();

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        createalist();
        addtobeginning(scanner);
        addtoend(scanner);
        removeelement(scanner);
        exitorrepeat(scanner);
 
        scanner.close();
    }

    public static void createalist() {
        // Adding elements directly to the class-level Rainbowlist
        Rainbowlist.add("Red");
        Rainbowlist.add("Orange");
        Rainbowlist.add("Yellow");
        Rainbowlist.add("Green");
        Rainbowlist.add("Blue");
        Rainbowlist.add("Indigo");
        Rainbowlist.add("Violette");

        System.out.println(Rainbowlist);
        System.out.println("There are " + Rainbowlist.size() + " items in the list.");
    }

    public static void addtobeginning(Scanner scanner) {

        System.out.println("Please enter a color to add to the beginning of the list");

        String beginningcolor = scanner.nextLine();

        Rainbowlist.addFirst(beginningcolor);

        System.out.println("The new list is " + Rainbowlist);

    }
    public static void addtoend(Scanner scanner) {

        System.out.println("Please enter a color to add to the end of the list");

        String endcolor = scanner.nextLine();

        Rainbowlist.addLast(endcolor);

        System.out.println("The new list is " + Rainbowlist);

    }
    public static void removeelement (Scanner scanner){

        if (Rainbowlist.isEmpty()){
            System.out.println("The list is empty.There is nothing to remove.");
        }
            else {
                System.out.println("Please enter a color to remove from the list.");

                String itemtoremove = scanner.nextLine();
                
                if (Rainbowlist.contains(itemtoremove)){
                    Rainbowlist.remove(itemtoremove);
                    System.out.println("Item removed succesfully. Please see updated list: " + Rainbowlist);
                }
                else{
                    System.out.println("Item not found, Sorry");
                }  
            }
    }
    public static void exitorrepeat(Scanner scanner){
        boolean continueremoving = true;

            while (continueremoving) {
                System.out.println("Enter 'Exit' to quit the program and continue to keep removing");
                String userIn = scanner.nextLine();

                if (userIn.equalsIgnoreCase("exit")){
                    continueremoving = false;
            }
                    else{removeelement(scanner);
                }
        }
    }
}
