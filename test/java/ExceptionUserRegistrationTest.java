import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    public void firstName() throws InputInvalidException {
        String firstName = "Sachin";
        Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
    }

    @Test
    public void lastName() throws InputInvalidException {
        String lastName = "Tendulakar";
        Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
    }

    @Test
    public void emailId() throws InputInvalidException {
        String emailId = "sachin.tendulkar1992@gmail.com";
        Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
    }

    @Test
    public void mobileNumber() throws InputInvalidException {
        String mobileNumber = "91 7845478965";
        Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
    }

    @Test
    public void password() throws InputInvalidException{
        String password = "Sachin@7563";
        Assert.assertTrue(exceptionUserRegistration.testPassword(password));
    }

}