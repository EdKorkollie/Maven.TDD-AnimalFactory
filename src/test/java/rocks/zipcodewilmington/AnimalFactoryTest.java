package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog(){
        String givenName = "yummy";
        Date givenBirthDate = new Date();
        // when(a dog is constructed)
        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);
        //when we retreive data from the do
        String retrieveName = dog.getName();
        Date retrieveDate = dog.getBirthDate();

        Assert.assertEquals(givenName, retrieveName);
        Assert.assertEquals(givenBirthDate, retrieveDate);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat(){
        String givenName = "Duuh";
        Date givenBirthDate = new Date();
        // when(a dog is constructed)
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
        //when we retreive data from the do
        String retrieveName = cat.getName();
        Date retrieveDate = cat.getBirthDate();

        Assert.assertEquals(givenName, retrieveName);
        Assert.assertEquals(givenBirthDate, retrieveDate);
    }
}
