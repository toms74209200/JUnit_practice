package junit.tutorial.ch11;

import java.util.Date;

public class DelegateObjectExampleSimple {

    DateFactorySimple dateFactorySimple = new DateFactorySimple();
    Date date = new Date();

    public void  doSomething() {
        this.date = dateFactorySimple.newDate();
        // do something
    }
}
