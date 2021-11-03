import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
        String actualResult = moodAnalyzer.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", actualResult);
    }

    @Test
    public void givenEmail2_WhenNotProper_ReturnEntryFailed() {
        String actualResult = moodAnalyzer.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", actualResult);
    }

}