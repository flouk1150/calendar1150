import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void testTime(){
        Assert.assertEquals(Controller.test(),"16.00");
    }

}