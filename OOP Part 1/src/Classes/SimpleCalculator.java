package Classes;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println();
    }

   private double firstNumber;
   private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double setFirstN){
        //needs to set the value of the firstNumber
        firstNumber = setFirstN;
    }
    public void setSecondNumber(double setSecondN){
        //needs to set the value of the secondNumber
        secondNumber = setSecondN;
    }
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
       if (secondNumber == 0){
           return 0;
       }
        return firstNumber / secondNumber;
    }
}
