import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SocialNetworkSearcherTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    SocialNetwork sn = new SocialNetwork();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testLocalClass(){
        //Given

        class overTwentyOne implements CheckPerson{

            public boolean test(Person p) {
                return (p.getAge() > 21);
            }

        }

        String expected = "Name: Nikki Age: 50 Gender: FEMALE E-mail Address: nikki@gmail.com\n" +
                "Name: Brad Age: 55 Gender: MALE E-mail Address: brad@gmail.com\n";

        //When
        SocialNetworkSearcher.printPersons(sn.members, new overTwentyOne());

        //Then
        Assert.assertEquals(expected, outContent.toString());


    }

}
