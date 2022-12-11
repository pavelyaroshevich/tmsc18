package by.tms.models.clothes.person;

import by.tms.models.clothes.jacket.Jacket;
import by.tms.models.clothes.pants.Pants;
import by.tms.models.clothes.shoes.Shoes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person implements PersonAware {
    private String name;
    private Shoes shoes;
    private Jacket jacket;
    private Pants pants;

    public Person(String name, Shoes shoes, Jacket jacket, Pants pants) {
        this.name = name;
        this.shoes = shoes;
        this.jacket = jacket;
        this.pants = pants;
    }

    @Override
    public void getDressed() {
        System.out.println(getName());
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void undress() {
        System.out.println(getName());
        jacket.remove();
        pants.remove();
        shoes.remove();
    }
}
