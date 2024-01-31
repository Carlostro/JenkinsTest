package test.java;

public class AppTest{
    @test
    public void testApp(){
        Application myApp= new Application();

        String result = myApp.getStatus();

        assertEquals("OK", result);

    }
}
