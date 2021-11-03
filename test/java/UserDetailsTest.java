import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
    UserDetails userDetails = new UserDetails();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.firstName("Sachin");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = userDetails.firstName("sachin");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.lastName("Tendulkar");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = userDetails.lastName("");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.email("afroz.satvilkar2014@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = userDetails.email("afrozsatvilkar.gmail.com");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.phoneNumber("91 9075528330");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = userDetails.phoneNumber("91 907552833047");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.password("Afroj@786");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = userDetails.password("jnsdsjRcvc");
        Assert.assertEquals(false, actualResult);
    }
}