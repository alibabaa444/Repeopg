/* package org.example;

public class PasswordValidater {

    int minLength;
    int maxLength;
    int numbersRequired;
    String password;

    public PasswordValidater(String password, int minLength, int maxLength, int numbersRequired) {
        this.password = password;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }

    public boolean isValid(String password) {
    int Length = password.length();

        if (Length < minLength || Length > maxLength) {
            return false;
        }

        else {
        }
        return true;
        

    }
}
*/

package org.example;

public class PasswordValidater {

    int minLength;
    int maxLength;
    boolean numbersRequired;
    String password;

    public PasswordValidater(String password, int minLength, int maxLength, boolean numbersRequired) {
        this.password = password;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }

    public boolean isValid() {
        int length = password.length();

        return length >= minLength && length <= maxLength &&
                (!numbersRequired || password.matches(".*\\d.*")) &&
                password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }
}

    
// hvis numbersrequired er falsk, eller password har minimum 1 enkel tal for 0-9 is string password. er hele expression
// i paranteset true.
