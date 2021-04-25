package pl.pjatk.alepen;


public class MyFirstComponent {
    public MyFirstComponent(PojoImpl pojoImpl){
        System.out.println("MyFirstComponent");
        System.out.println(pojoImpl.getSomeName());
    }

    public void helloMethod(){
        System.out.println("Hello from 1 method");
    }

}
