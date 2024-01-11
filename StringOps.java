import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
        String s = "hello world";
        System.out.println("the array of the indexes were l is in the string is " +Arrays.toString(allIndexOf(s, 'l')));
        
    }

    public static String capVowelsLowRest (String string) {
        String new_string = " ";
        char char_to_add;
        for (int i = 0; i<string.length(); i++)
        {
            if (isVowel(string.charAt(i)))
            {
                char_to_add = string.charAt(i);
                char_to_add = Character.toUpperCase(char_to_add);
                new_string = new_string + char_to_add; //make it upper case if the charcter is a vowel 
            }
            else 
            {
                char_to_add = Character.toLowerCase(string.charAt(i));
                new_string = new_string + char_to_add; //if it's not a vowel make it lower case
            }
        }
        return new_string;
        }
    public static boolean isVowel(char c) //checks if the charcter is a vowel 
    {
        if (c == 'a' || c =='e'|| c=='o' || c=='i' || c=='u')
        {
            return true; 
        }
        if (c == 'A' || c== 'E' || c=='O' || c=='I' || c== 'U')
        {
            return true;
        }
        return false; 
    }

    public static String camelCase (String string) {
        String new_string = "";
        for (int i = 0; i<string.length(); i++)
        {
                if (string.charAt(i) == ' ') //checks if there was a space before the char
                {
                    char charToAdd = Character.toUpperCase(string.charAt(i+1)); // make it caps lock
                    System.out.println(charToAdd);
                    if (charToAdd != ' ')
                    {
                        new_string = new_string + charToAdd;
                        i ++;
                    }
                }
                else 
                {
                    char charToAdd = Character.toLowerCase(string.charAt(i)); //make the char lower case
                    new_string = new_string + charToAdd; 
                }
        }
        return new_string;
    }
    public static String trimString (String s, int index) //creates a function that trims a string based on the index
    {
        String new_string = "";
        for (int i = index; i<s.length(); i++)
        {
            new_string = new_string + s.charAt(i);
        }
        return new_string;
    }

    public static int[] allIndexOf (String string, char chr) { //function should return an array containing all the indexes where a char is in the world 
         //declares an array with the number of elements in the string
        int count = 0;
        for (int i = 0; i<string.length(); i++)
        {
            if (string.charAt(i) == chr)
            {
                count++;
            }
        }
        int[] index = new int[count]; //declares an array according to the number of times the char is in the string
        int array_index = 0;
        for (int i = 0; i<string.length(); i++)
        {
            if (string.charAt(i) == chr)
            {
                index[array_index] = i;
                array_index++;
            }
        }

        return index;
    }
}
