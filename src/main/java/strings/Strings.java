package strings;

public class Strings {

    public static String letters() {
        String a = "Legia";
        String b = " mistrz";
        return a+b;

    }

    public static boolean stringsCompare(String a, String b) {

                return a.equals(b);
    }

    public static boolean stringsCompareNoCase(String a, String b) {

        return a.toLowerCase().equals(b.toLowerCase());
    }

    public static String whichLonger(String a, String b) {

        if(a.length() > b.length()) {
            return "String a is longer than String b";
        } else if (a.length() < b.length()) {
            return "String b is longer than String a";
        } else {
            return "Both Strings are the same length";
        }
    }


}
