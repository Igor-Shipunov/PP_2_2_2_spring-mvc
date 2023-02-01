package web.models;

public class Car {
    private String model;
    private String maker;
    private int enginePower;

    public Car(){}

    public Car(String model, String maker, int enginePower) {
        this.model = model;
        this.maker = maker;
        this.enginePower = enginePower;
    }
    public String getNameOfModel() {
        return model;
    }

    public void setNameOfModel(String nameOfModel) {
        this.model = nameOfModel;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
