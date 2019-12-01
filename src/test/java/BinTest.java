import org.junit.Assert;
import org.junit.Test;

public class BinTest {

    @Test
    public void saveRollsTest(){

        //When
        Bins testBin = new Bins(1, 1);

        //Then
        testBin.saveRolls();

        //Expected
        Assert.assertNotNull(testBin);

    }
}
