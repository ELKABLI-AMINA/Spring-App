package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
          metier.setDao(dao); // Injection des dépendances
        System.out.println("res est :" + metier.calcule());

    }
}
