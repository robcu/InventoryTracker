import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //print inventory
    //add item
    //remove item
    //change item quantity

    static ArrayList<InventoryItem> inventory = new ArrayList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Inventory Options:");
            System.out.println("[1] - Add a new item");
            System.out.println("[2] - Remove an item");
            System.out.println("[3] - Modify an item's quantity");
            System.out.println("[4] - Print inventory");

            Integer menuOption = Integer.parseInt(scanner.nextLine());

            switch(menuOption) {
                case 1:
                    System.out.println("Enter the name of the item you wish to add:");
                    inventory.add(new InventoryItem(scanner.nextLine(), 0));
                    break;
                case 2:
                    System.out.println("Enter the number of the item you wish to remove:");
                    inventory.remove(Integer.parseInt(scanner.nextLine()));
                    break;
                case 3:
                    System.out.println("Enter the number of the item, the quantity of which you wish to change:");
                    Integer key = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.println("Enter the new quantity:");
                    Integer newQuantity = Integer.parseInt(scanner.nextLine());
                    InventoryItem tobeModified = new InventoryItem(inventory.get(key).name, newQuantity);
                    inventory.set(key, tobeModified);
                    break;
                case 4:
                    for(int i = 0; i < inventory.size(); i++){
                        System.out.println("[" + (i+1) + "] - " + inventory.get(i).name + ", " + inventory.get(i).quantity);
                    }
                    break;
                default:
                    System.out.println("default");

            }
        }
    }
}

