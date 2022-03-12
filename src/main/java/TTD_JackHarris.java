import java.util.Arrays;

public class TTD_JackHarris {
    //Given array of numbers as strings, ie. {"1", "5", "15", "9", "4"}
    //sort without converting to integer
    public static String[] stringSort(String[] input){
        String temp = "";
        boolean sortedFlag;
//        for (int j=0;j<input.length;j++) {
        do {
            sortedFlag = false;
            for (int i = 1; i < input.length; i++) {
                if (firstNumberIsBigger(input[i-1],input[i]))
//                if (input[i - 1].length() > input[i].length() ||
//                        (input[i - 1].length() == input[i].length()
//                                && (input[i - 1].compareTo(input[i]) > 0)))
                {
                    temp = input[i - 1];
                    input[i - 1] = input[i];
                    input[i] = temp;
                    sortedFlag = true;
                }
            }
        } while (sortedFlag);
        return input;
    }
    public static boolean firstNumberIsBigger (String first, String second){
        if (first.charAt(0) == '-' && second.charAt(0) != '-')
            return false;
        if (second.charAt(0) == '-' && first.charAt(0) != '-')
            return true;
        if (first.charAt(0) == '-' && second.charAt(0) == '-'){
            if (first.length() > second.length())
                return false;
            if (first.length() < second.length())
                return true;
            if (first.substring(1).compareTo(second.substring(1)) < 0)
                return true;
            else
                return false;
        }
        if (first.length() > second.length())
            return true;
        if (first.length() == second.length()
                        && (first.compareTo(second) > 0))
            return true;
        return false;
    }
}
