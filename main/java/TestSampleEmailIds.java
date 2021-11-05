import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSampleEmailIds {

    public boolean testForValidEmails(String validEmails) {
        Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
        Matcher matcher = pattern.matcher(validEmails);
        return matcher.matches();
    }

    public boolean testSampleEmailId(String validEmails) throws InputInvalidException {
        try {
            if (!testForValidEmails(validEmails)) {
                throw new InputInvalidException("Entered EmailId is Invalid");
            } else {
                System.out.println("Entered EmailId is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return testForValidEmails(validEmails);
    }
}