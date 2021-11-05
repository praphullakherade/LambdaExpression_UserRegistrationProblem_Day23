import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestSampleEmailIdsTest {
    TestSampleEmailIds testSampleEmailIds = new TestSampleEmailIds();

    @Test
    public void givenEmailId1_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc@yahoo.com";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }

    @Test
    public void givenEmailId2_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc-100@yahoo.com";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }

    @Test
    public void givenEmailId3_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc.100@yahoo.com";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }

    @Test
    public void givenEmailId4_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc111@abc.com";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }

    @Test
    public void givenEmailId5_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc-100@abc.net";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }

    @Test
    public void givenEmailId6_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc.100@abc.com.au";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }

    @Test
    public void givenEmailId7_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc@1.com";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }

    @Test
    public void givenEmailId8_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc@gmail.com.com";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }

    @Test
    public void givenEmailId9_IsProper_ReturnTrue() throws InputInvalidException{
        String validEmails = "abc+100@gmail.com";
        Assert.assertTrue(testSampleEmailIds.testForValidEmails(validEmails));
    }
}