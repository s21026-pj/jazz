package pl.pjatk.alepen;

public class Car {
    private String Name;
    private String model;

    public Car() {
    }

    public Car(String name, String model) {
        this.Name = name;
        this.model = model;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
