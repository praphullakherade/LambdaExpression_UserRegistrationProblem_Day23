import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

    // validating first name
    public boolean firstName(String str) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // validating last name
    public boolean lastName (String str){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // validating email
    public boolean email(String str) {
        Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean phoneNumber(String str) {
        Pattern pattern = Pattern.compile("^(\\+?\\d{2}?\\s{1})?(\\d{10})$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean password(String str) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])([a-zA-Z0-9@$!%*#?&]){8,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}
