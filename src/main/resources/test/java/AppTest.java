package test.java;

import java.beans.Transient;

import com.example.Application;

public class AppTest {

    @test

    public void testApp(){
        Application myApp =new Application();

        String result = myApp.getStatus();

        assertEquals("OK",result);

    }
     
}
