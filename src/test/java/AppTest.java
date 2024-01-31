import com.example.Application;
import org.junit.test;
import static org.junit.Assert.*;
public class AppTest {

    @test

    public void testApp(){
        Application myApp =new Application();

        String result = myApp.getStatus();

        assertEquals("OK",result);

    }
     
}
