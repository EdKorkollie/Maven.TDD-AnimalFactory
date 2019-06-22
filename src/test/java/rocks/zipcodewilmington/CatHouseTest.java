package rocks.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;

import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatHouseTest(){
        Cat expectedcat = new Cat(null, null, 10);
        // create a cathouse object
       CatHouse house = new CatHouse();
       //call the add cat method giving it a parameter
       house.add(expectedcat);
       //creating actual cat in order to retrieve the cat id that was added
       Cat actualCat = house.getCatById(10);
       Assert.assertEquals(expectedcat, actualCat);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatTest(){
        Cat removeCate = new Cat(null, null, 5);
        CatHouse house = new CatHouse();
        house.add(removeCate);

        house.remove(5);
        //Actual cat variable with a type Cat
        Cat actual = house.getCatById(5);
        Assert.assertEquals(null, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatByNameTest(){
        Cat removeCate = new Cat(null, null, 5);
        CatHouse house = new CatHouse();
        //clear the cathouse before adding a cat
        house.clear();
        house.add(removeCate);

        house.remove(removeCate);
        //actual cat variable with a type Cat
        Cat actual = house.getCatById(5);
        Assert.assertEquals(null, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIDTest(){
        Cat getCat = new Cat(null, null, 5);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(getCat);

        // actual cat variable, with a type Cat.
        Cat actual = house.getCatById(5);
        Assert.assertEquals(getCat, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        Cat getCatNum = new Cat(null, null, 5);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(getCatNum);
        Integer expected = 1;

        Integer actual =house.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

}
