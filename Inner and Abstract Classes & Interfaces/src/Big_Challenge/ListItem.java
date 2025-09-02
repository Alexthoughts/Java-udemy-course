package Big_Challenge;

public abstract class ListItem {
    protected ListItem rightLink = null; //правее в String/int...
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem (Object value) {
        this.value = value;
    }

    abstract ListItem next(); //move to the next item
    abstract ListItem setNext(ListItem item); //set the next item
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
