package SpringBoot;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    private int id;
    private String name;
    private float price;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return id;
    }

}
