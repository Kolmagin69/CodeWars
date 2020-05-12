package BraceChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTest {
    BraceChecker braceChecker = new BraceChecker();
    @Test
    void test_isValid() {

        String inputStr1 = "(){}[]";
        String inputStr2 = "({[Hi!]})";
        String inputStr3 = "({[]])";
        String inputStr4 = "()[){}";
        String inputStr5 = "([)]";
        String inputStr6 = "))";

        assertTrue(braceChecker.isValid(inputStr1));
        assertTrue(braceChecker.isValid(inputStr2));
        assertFalse(braceChecker.isValid(inputStr3));
        assertFalse(braceChecker.isValid(inputStr4));
        assertFalse(braceChecker.isValid(inputStr5));
        assertFalse(braceChecker.isValid(inputStr6));
    }
    @Test
    public void testInvalid() {
        assertEquals(false, braceChecker.isValid(" (((("));
    }
}