import java.time.LocalDate;
import java.time.Year;
import java.time.chrono.ChronoLocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return birthday.until(LocalDate.now()).getYears();
    }

    public void printPerson() {
        System.out.println(String.format("Name: %s Age: %d Gender: %s E-mail Address: %s",
                name, getAge(), gender, emailAddress));
    }
}
