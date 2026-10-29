package ud4.methods;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import static ud4.methods.PasswordStrengthChecker.checkStrength;

import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import ud4.methods.PasswordStrengthChecker.PasswordStrength;

class PasswordStrengthCheckerTest {
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {
            "a",
            "aaaaaaa",
            "5aBx+!g",
        }
    )
    void invalidTests(String password) {
        PasswordStrength actual = checkStrength(password);

        assertEquals(PasswordStrength.INVALID, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abcdefgh",
            "ABCDEFGH",
            "++--**//"
    }
    )
    void weakTests(String password) {
        PasswordStrengthChecker.PasswordStrength actual = checkStrength(password);

        assertEquals(PasswordStrengthChecker.PasswordStrength.WEAK, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abcdEFGH",
            "abcd++--",
            "ABCD++--",
    }
    )
    void MediumTests(String password) {
        PasswordStrengthChecker.PasswordStrength actual = checkStrength(password);

        assertEquals(PasswordStrengthChecker.PasswordStrength.MEDIUM, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abcDEF*+",
    }
    )
    void strongTests(String password){
        PasswordStrengthChecker.PasswordStrength actual = checkStrength(password);

        assertEquals(PasswordStrengthChecker.PasswordStrength.STRONG, actual);
    }
}