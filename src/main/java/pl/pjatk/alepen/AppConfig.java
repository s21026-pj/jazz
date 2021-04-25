package pl.pjatk.alepen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public PojoImpl pojoImpl(){
        System.out.println("PojoImpl");
        return new PojoImpl(12,"Something from pojo");
    }
    @Bean
    public PojoImpl pojoSecondImpl(){
        System.out.println("PojoImpl");
        return new PojoImpl(12,"Something from pojo2");
    }

    @Bean
    public Object someObject(){
        return new PojoImpl();
    }
    @Bean
    public List<String> defaultData(PojoImpl pojoImpl){
        System.out.println("DefaultData");
        pojoImpl.soutMe();
        List listSimple= new ArrayList(5) ;
        listSimple.add("One");
        listSimple.add("Two");
        listSimple.add("Three");
        listSimple.add("Four");
        listSimple.add("Five");
        return listSimple;
    }
}
