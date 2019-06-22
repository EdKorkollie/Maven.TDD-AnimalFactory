package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test
    public void setNameTest() {
        // Given (cat data)
        String expectedName = "Zula";

        // When (a cat is constructed)
        Cat cat1 = new Cat(null, null, null);

        // When (we retrieve data from the cat)
        cat1.setName(expectedName);

        String actualName = cat1.getName();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void setBirthDateTest() {
        // Given (cat data)
        Date expectedBirthDate = new Date();

        // When (a cat is constructed)
        Cat cat1 = new Cat(null, null, null);

        // When (we retrieve data from the cat)
        cat1.setBirthDate(expectedBirthDate);

        Date actualBirthDay = cat1.getBirthDate();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedBirthDate, actualBirthDay);

    }
    @Test
    public void speakTest() {
        // Given (cat data)
        String expectedSound = "meow!";

        // When (a cat is constructed)
        Cat cat1 = new Cat(null, null, null);

        // When (we retrieve data from the cat)
        String actualSound = cat1.speak();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedSound, actualSound);
    }
    @Test
    public void eat() {
        // Given (cat data)
        Integer numberOfMealsEater = 0;


        // When (a cat is constructed)
        Cat cat1 = new Cat(null, null, null);
        Food food = new Food();
        cat1.eat(food);
        Integer actualMeals = cat1.getNumberOfMealsEaten();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals((Integer)(numberOfMealsEater +1), actualMeals);
    }
}
