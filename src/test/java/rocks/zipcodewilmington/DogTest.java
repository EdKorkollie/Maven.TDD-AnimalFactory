package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void setBirthDateTest() {
        // Given (dog data)
        Date birthDate = new Date(2010 - 10 - 11);

        // When (a cat is constructed)
        Dog dog = new Dog(null, null, null);
        //when(a dog's birthdate is set to a new date
        Date newDate = new Date();

        dog.setBirthDate(newDate);
        //we expect to get the new birth date from the dog
        Date dogDate = dog.getBirthDate();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newDate, dogDate);
    }
    @Test
    public void speakTest(){
        // Given (dog data)
        String expectedSound = "bark!";

        // When (a dog is constructed)
        Dog dog = new Dog(null, null, null);

        // When (we retrieve data from the cat)
        String actualSound = dog.speak();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedSound, actualSound);
    }
    @Test
    public void eatTest(){
        // Given (dog data)

        // When (a dog is constructed)
        Dog dog = new Dog(null, null, null);
        int initialMeals = dog.getNumberOfMealsEaten();

        // When (the eat method is called on the dog)
        Food food = new Food();
        dog.eat(food);
        //(the number of meals eaten should increase by 1)

        int finMeals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(initialMeals + 1, finMeals);
    }
    @Test
    public void getIdTest(){
        // Given (a dog exists with a specific ID number)

        // When (a dog exists with a specific ID number))
        Dog dog = new Dog(null, null, 15);
        int initialMeals = dog.getNumberOfMealsEaten();

        // the ID is called from the object
        int actualID = dog.getId();

        //(tthe ID given in the constructor should equal the ID returned from the get ID method)

        ;
        Assert.assertEquals(15, actualID);
    }
    @Test
    public void instanceOfAnimalTest(){
        // Given (a dog exist)

        // When (a dog exists ))
        Dog dog = new Dog(null, null, null);


        // the instanceof keyword is used to tell whether dog inherits from animal
       boolean instanceOfAnimal = dog instanceof Animal;

        //(tthe ID given in the constructor should equal the ID returned from the get ID method)

        ;
        Assert.assertTrue(instanceOfAnimal);
    }
}
