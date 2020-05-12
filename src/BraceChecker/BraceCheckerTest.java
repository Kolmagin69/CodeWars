package BraceChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTest {

    @Test
    void test_isValid() {
        BraceChecker braceChecker = new BraceChecker();
        String inputStr1 = "(){}[]";
        String inputStr2 = "({[Hi!]})";
        String inputStr3 = "({[]])";
        String inputStr4 = "()[){}";

        assertTrue(braceChecker.isValid(inputStr1));
        assertTrue(braceChecker.isValid(inputStr2));
        assertFalse(braceChecker.isValid(inputStr3));
        assertFalse(braceChecker.isValid(inputStr4));

    }
}