package api.stepdef.reqresin;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHook {
    
    @Before
    public void Before(){
        System.out.println("Ini di eksekusi sebelum test");
    }

    @After
    public void After(){
        System.out.println("Delete data Testing di database");
    }
}
