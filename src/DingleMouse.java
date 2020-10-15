
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class DingleMouse {
    public static String siegfried(final int week, final String str) {
        String[] strArray = str.split("\\s+");
        String[] rules1 = new String[]{"ci", "si", "ce", "se", "c", "k"};

        return null;

    }

    private static String replace(String str, char old1, char old2, char new1, char new2) {
        char[] strArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i] == old1 && strArray[i + 1] == old2) {
                strArray[i] = new1;
                strArray[i + 1] = new2;
                i++;
            }
        }
        return new String(strArray);
    }
    private static String replace1(String str, String oldChars, String newChars) {
        String str1 = str.toLowerCase();
        return str1.replace(oldChars, newChars);
    }


    public static void main(String[] args) {
        Week week = new Week();
        System.out.println(week.week2.changeWithRule("cicicecephph"));
    }

    private static abstract class WeekDecorator {
        WeekDecorator previousWeek;

        WeekDecorator(WeekDecorator previousWeek) {
            this.previousWeek = previousWeek;
        }

        abstract String changeWithRule(String str);
    }

    private static class Week {
        WeekDecorator week1 = new WeekDecorator(null) {
            @Override
            String changeWithRule(String str) {
               String result = replace1(str,"ci", "si");
               result = replace1(result,"ce", "se");
               return result;
            }
        };
        WeekDecorator week2 = new WeekDecorator(week1) {
            @Override
            String changeWithRule(String str) {
                return replace1(previousWeek.changeWithRule(str), "ph", "f");
            }
        };
        WeekDecorator week3 = new WeekDecorator(week2) {
            @Override
            String changeWithRule(String str) {
                return null;
            }
        };

    }
}

