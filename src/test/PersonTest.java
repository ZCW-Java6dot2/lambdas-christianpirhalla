

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class PersonTest {

    @Test
    public void getAgeTest(){
        //Given
        LocalDate birthday = LocalDate.of(2017, 1, 1);
        Person p1 = new Person("Fred", birthday, Person.Sex.MALE, "yoohoo@yahoo.com");
        int expected = p1.birthday.until(LocalDate.now()).getYears();

        //When
        int actual = p1.getAge();

        //Then
        System.out.println(String.format("Expected: %d Actual: %d", expected, actual));
        Assert.assertEquals(expected, actual);
    }

}
