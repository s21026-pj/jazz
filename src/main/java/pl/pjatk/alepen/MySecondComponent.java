package pl.pjatk.alepen;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {
    public MySecondComponent(ApplicationContext applicationContext){
        System.out.println("MySecondComponent");
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent",MyFirstComponent.class);
        myFirstComponent.helloMethod();
    }
    public void helloMethod(){
        System.out.println("Hello from 2 method");
    }

}
