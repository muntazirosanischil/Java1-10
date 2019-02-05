public class Sprinter {

    /*The parameter weekday is true if it is a weekday,
    and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation.
    Return true if we sleep in.

    done
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    /*Given a string name, e.g. "Bob",
    return a greeting of the form "Hello Bob!".

    done
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /*Given a string and a non-negative int n,
    return a larger string that is n copies of the original string.

    done
     */
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    /*Given three ints, a b c, return true if
    one of them is 10 or more less than one of the others.

    done
     */
    public boolean lessBy10(int a, int b, int c) {
        if(a <= b - 10){
            return true;
        }else if(b <= c - 10){
            return true;
        }else if(c <= a - 10){
            return true;
        }else if(b <= a - 10){
            return true;
        }else if(a <= c - 10){
            return true;
        }else if(c <= b - 10){
            return true;
        }
        return false;
    }

    /*Given an array of ints, return true if
    6 appears as either the first or last element in the array.
    The array will be length 1 or more.

    done
    */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6){
            return true;
        }
        return false;
    }

    /*Given 2 int values greater than 0,
    return whichever value is nearest to
    21 without going over. Return 0 if
    they both go over.

    done
     */
    public int blackjack(int a, int b) {
        if(a > b && a <= 21){
            return a;
        }else if(b > a && b <= 21){
            return b;
        }else if(b > a && b > 21 && a <= 21) {
            return a;
        }else if(a > b && a > 21 && b <= 21){
            return b;
        }else if(a > b && a <= 21){
            return a;
        }else if(b > a && b <= 21){
            return b;
        }
            return 0;
    }

    /*Return the number of times that the string
    "hi" appears anywhere in the given string.

    done
     */
    public int countHi(String str) {
        int counter = 0;
        for(int i=0; i < str.length()-1; i++) {
            if(str.substring(i, i+2).equals("hi")) {
                counter++;
            }
        }
        return counter;
    }

    /*Given a string, count the number of words ending in 'y' or 'z'
    -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the
    'y' in "yellow" (not case sensitive). We'll say that a y or z
    is at the end of a word if there is not an alphabetic letter
    immediately following it.
    (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

    done
     */
    public int countYZ(String str) {
        int counter = 0;
        str = str.toLowerCase() + "";
        for(int i = 0; i < str.length() - 1; i++){
            if((str.charAt(i) == "y" || str.charAt(i) == "z")
                && !Character.isLetter(str.charAt(i + 1)){
                counter++;
            }
        }
        return counter;
    }

    /*Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

    done
     */
    public int countEvens(int[] nums) {
        int counter = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    /*Given a non-empty array, return true if
    there is a place to split the array so that
    the sum of the numbers on one side is equal to
    the sum of the numbers on the other side.

    done
     */
    public boolean canBalance(int[] nums) {
        int firstSum = 0;
        for (int l = 0; l < nums.length; l++) {
            firstSum += nums[l];
            int secondSum = 0;
            for (int r = nums.length-1; r > l; r--) {
                secondSum += nums[r];
            }
            if (secondSum == firstSum)
            return true;
        }
        return false;
    }
