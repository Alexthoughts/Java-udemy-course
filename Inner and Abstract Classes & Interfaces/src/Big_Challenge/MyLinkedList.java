package Big_Challenge;

//root = самый верх списка
//comparison = cравнение

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        //if the head of the list is null -> item becomes the head of the list
        //if the added item < current item -> add before the current
        //if the added item > current item -> add after the current and compare again

        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem)); //сравнили и получили число (0, <0, >0)
            if (comparison < 0) {
                //newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no next, so insert at the end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //new item is less, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    //the node with a previous root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + " is already added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item" + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comprassion = currentItem.compareTo(item);
            if (comprassion == 0) {
                //found the item to delete
                if (currentItem == this.root) {
                this.root = currentItem.next();
            } else {
                currentItem.previous().setNext(currentItem.next());
                if (currentItem.next() != null) {
                    currentItem.next().setPrevious(currentItem.previous());
                }
            }
            return true;
            } else if (comprassion < 0) {
                currentItem = currentItem.next();
            } else { //comprassion > 0
                //We are at an item greater than the one to bedeleted
                //so the item is not in the list
                return false;
            }
        }
        //We have reached the end of the list
        //Without finding the item to delete
        return false;
    }

    @Override //отбражаем значения
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
    }
