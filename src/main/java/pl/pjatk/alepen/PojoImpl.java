package pl.pjatk.alepen;

import org.springframework.beans.factory.annotation.Value;

public class PojoImpl {
    private int number=13;
    private String name="Lucky";
    @Value("${my.custom.property:my default value}") private String someName;

    public PojoImpl(int number) {
        this.number = number;
    }

    public PojoImpl(String name) {
        this.name = name;
    }

    public PojoImpl(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public PojoImpl() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void soutMe(){
        System.out.println("Hello from PojoImpl");
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }
}
