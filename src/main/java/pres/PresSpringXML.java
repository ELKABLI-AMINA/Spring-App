package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {

    public static void main(String[] args) {
        ApplicationContext springContex = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = springContex.getBean(Imetier.class);
        System.out.println("resultat :" + metier.calcule());

    }

}
