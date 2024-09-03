package com.example.javabasedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    public Alien() {
        System.out.println("Alien object created");
    }

    @Autowired //when we are using the autowired it means we are injecting the  field injection i.e private Computer comp
    @Qualifier("desktop") //it specifies the bean because there are two bean i.e laptop desktop // if we use qualifier and primary simultaneously the qualifier will be ahead
    private Computer comp;
    private int Age;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = Age;
    }




    public void code() {
        System.out.println("Alien is coding");
        comp.compile();
    }
}
