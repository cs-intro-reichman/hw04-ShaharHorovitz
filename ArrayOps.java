public class ArrayOps {
    public static void main(String[] args)
    {
        int[] array1 = {1, -2, 3};
        int [] array2 = {1, 2, 1, 1, 2};
        int num = 4;
        //System.out.println("the num " + num +"is in the array " + isInArray(array, num));
        //System.out.println("the missing number in the array is " + findMissingInt(array));
        //System.out.println("the secound max is " + secondMaxValue(array));
        System.out.println("the array is sorted " + isSorted(array1));

    }
    
    public static int findMissingInt (int [] array) {
        int missing_num = 0;
        for (int i = 0; i<=array.length; i++)
        {
            if (isInArray(array, i)==false)
            {
                missing_num = i;
            }   
        }  
        return missing_num;

    }
    public static boolean isInArray (int [] array, int num) //the function gets to variables, an array and an int, and checks if the number is in the array
    {
        for ( int i = 0; i<array.length; i++)
        {
            if (array[i] == num)
            {
                return true;
            }
        }
        return false; 
    }

    public static int findMax (int [] array) //function gets and array and find the max value
    {
        int max = array[0];
        for (int i = 0; i<array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max; 
    }
    public static int countNum(int [] array, int num)
    {
        int count = 0;
        for(int i=0; i<array.length; i++)
        {
            if (array[i]==num)
            {
                count++;
            }
        }
        return count; 
    }

    public static int secondMaxValue(int [] array) {
        int max = findMax(array);
        if (countNum(array, max)>1)
        {
            return max;
        }
        int secound_max = max -1;
        for (int i = 0; i<array.length; i++) //go through every elemnet in the array
        {
            if (isInArray(array, secound_max))
            {
                return secound_max;
            }
            secound_max--;
        }
        return secound_max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i =0; i<array1.length; i++) //go through every element in the first array
        {
            if (!isInArray(array2, array1[i]))
            {
                return false; 
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        if (array[0] > array[1]) //if the first number is greater then the secound 
        {
            int max = array[0];
            for (int i = 1; i<array.length; i++)
            {
                if (array[i]< max)
                {
                    max = array[i];
                }
                else 
                {
                    return false; 
                }
            }
            return true; 
        }
        else 
        {
            int min = array[0];
            for (int i = 1; i<array.length; i++)
            {
                if (array[i]>min)
                {
                    min = array[i];
                }
                else 
                {
                    return false; 
                }
            }
            return true; 
        }
    }

}
