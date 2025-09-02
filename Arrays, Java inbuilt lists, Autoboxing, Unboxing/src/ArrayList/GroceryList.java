package ArrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItems (String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items"); //кол-во данных
        for (int i=0;i<groceryList.size();i++) {
            System.out.println((i+1)+" " + groceryList.get(i));//содержимое ArrayList
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem); //находим место в списку с помощью метода findItem
        if (position>=0) {
            modifyGroceryItem(position,newItem);// замена
        }
    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position,newItem); //modify item
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item); //находим место в списку с помощью метода findItem
        if (position>=0) {
            removeGroceryItem(position);// remove
        }
    }
    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        if(theItem.length() > 0) {
            groceryList.remove(position); //remove
        }
    }

    private int findItem(String searchItem) { //search the item in the ArrayList
        return groceryList.indexOf(searchItem);
//          boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem); //similar thing that searches the item and return the position
//        if (position>=0) {
//            return groceryList.get(position);
//        }
//        return null;
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position>=0) {
            return true;
        }
        return false;
    }


}
