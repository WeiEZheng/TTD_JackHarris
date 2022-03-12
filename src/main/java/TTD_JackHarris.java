import java.util.Arrays;

public class TTD_JackHarris {
    //Given array of numbers as strings, ie. {"1", "5", "15", "9", "4"}
    //sort without converting to integer
    public static String[] stringSort(String[] input){
        String temp = "";
        int count=1;
        for (int j=0;j<input.length;j++) {
            if (count == 0)
                break;
            count=0;
            for (int i = 1; i < input.length; i++) {
                if (firstNumberIsBigger(input[i-1],input[i]))
//                if (input[i - 1].length() > input[i].length() ||
//                        (input[i - 1].length() == input[i].length()
//                                && (input[i - 1].compareTo(input[i]) > 0)))
                {
                    temp = input[i - 1];
                    input[i - 1] = input[i];
                    input[i] = temp;
                    count++;
                }
            }
            System.out.println(Arrays.toString(input));
        }
        return input;
    }
    public static boolean firstNumberIsBigger (String first, String second){
        if (first.length() > second.length())
            return true;
        if (first.length() == second.length()
                        && (first.compareTo(second) > 0))
            return true;
        return false;
    }
}