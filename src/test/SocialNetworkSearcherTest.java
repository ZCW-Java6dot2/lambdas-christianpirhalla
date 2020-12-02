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
    public void testLambda(){
        //Given
        CheckPerson nameStartsWithA = (Person p) -> (p.name.startsWith("A"));
        String expected = "Name: Angela Age: 20 Gender: FEMALE E-mail Address: angela@gmail.com" +
                "\n";

        //When
        SocialNetworkSearcher.printPersons(sn.members, nameStartsWithA);

        //Then
        Assert.assertEquals(expected, outContent.toString());


    }

}
