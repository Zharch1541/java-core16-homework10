package Task1;

public class PhoneNumberValidator {

    public static boolean isValidNumber(String phoneNumber) {
        // for pattern: (xxx) xxx-xxxx
        if (phoneNumber.length() == 14) {
            if (phoneNumber.charAt(0) == '('
                    && phoneNumber.charAt(4) == ')'
                    && phoneNumber.charAt(5) == ' '
                    && phoneNumber.charAt(9) == '-') {
                return true;
            }
            // for pattern xxx-xxx-xxxx
        } else if (phoneNumber.length() == 12) {

            if (phoneNumber.charAt(3) == '-'
                    && phoneNumber.charAt(7) == '-') {
                return true;
            }
        }
        return false;
    }
}
