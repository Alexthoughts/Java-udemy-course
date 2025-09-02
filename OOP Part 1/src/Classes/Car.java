package Classes;

public class Car {
    protected String model; //it is class "model"

    public void setModel (String model){ //method
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera")) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }
    public String getModel (){
     return this.model;
    }
}

