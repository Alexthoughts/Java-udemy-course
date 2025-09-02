package Classes;

public class Person {
    public static void main(String[] args) {
        System.out.println();
    }

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstN){
        firstName = firstN;
    }
    public void setLastName(String lastN){
        lastName = lastN;
    }
    public void setAge(int age1){
        if (age1 < 0 || age1 > 100){
            age = 0;
        }else {
            age = age1;
        }
    }
    public boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        if (firstName.isEmpty()){
            return lastName;
        }
        if (lastName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
