package pl.pjatk.alepen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {
    public MyThirdComponent(ApplicationContext applicationContext){
        System.out.println("MyThirdComponent");
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent",MyFirstComponent.class);
        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent",MySecondComponent.class);

        myFirstComponent.helloMethod();
        mySecondComponent.helloMethod();
    }
}
