

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class PersonTest {

    @Test
    public void getAgeTest(){
        //Given
        Person p1 = new Person();
        p1.birthday = LocalDate.of(2017, 1, 1);
        int expected = p1.birthday.until(LocalDate.now()).getYears();

        //When
        int actual = p1.getAge();

        //Then
        System.out.println(String.format("Expected: %d Actual: %d", expected, actual));
        Assert.assertEquals(expected, actual);
    }

}
