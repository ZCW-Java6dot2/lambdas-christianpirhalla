import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    List<Person> members;

    public SocialNetwork(){
        members = new ArrayList<Person>();
        members.add(new Person("Mark", LocalDate.of(1999, 3, 1), Person.Sex.MALE, "mark@gmail.com"));
        members.add(new Person("Nikki", LocalDate.of(1970, 5, 1), Person.Sex.FEMALE, "nikki@gmail.com"));
        members.add(new Person("Angela", LocalDate.of(2000, 6, 1), Person.Sex.FEMALE, "angela@gmail.com"));
        members.add(new Person("Brad", LocalDate.of(1965, 12, 1), Person.Sex.MALE, "brad@gmail.com"));
    }

}
