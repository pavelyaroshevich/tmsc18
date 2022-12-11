package by.tms.services.clothes;

import by.tms.models.clothes.person.Person;
import by.tms.models.clothes.person.PersonAware;
import by.tms.models.clothes.jacket.AdidasJacket;
import by.tms.models.clothes.jacket.PumaJacket;
import by.tms.models.clothes.pants.AdidasPants;
import by.tms.models.clothes.pants.PumaPants;
import by.tms.models.clothes.shoes.AdidasShoes;
import by.tms.models.clothes.shoes.PumaShoes;

public class Main {
    public static void main(String[] args) {
        PersonAware person = new Person("Pavel", new PumaShoes(), new AdidasJacket(), new AdidasPants());
        PersonAware person1 = new Person("Christian", new AdidasShoes(), new PumaJacket(), new PumaPants());
        person.getDressed();
        person1.undress();
    }
}
