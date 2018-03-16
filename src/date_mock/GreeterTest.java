package date_mock;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void testTheDate(){
        Date date = new Date();
        Greeter greeter = new Greeter();
        greeter.greet("Alexey");

    }

}