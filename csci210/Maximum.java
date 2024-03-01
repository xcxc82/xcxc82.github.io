import java.util.Random;

public class Maximum
{
    public static int maxima(int [] array)
    {
        int m = 0;
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > array[m])
            {
                m = i;
            }
            i++;
        }
        return m;
    }
    public static int maximum(int [] array)
    {
        int temmaximum = array[0];
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > temmaximum)
                temmaximum = array[i];
            i++;
        }

        return temmaximum;
    }
    public static int minimum(int [] array){
        int temminimum = array[0];
        int i=1;
        while( i < array.length){
            if(array[i] < temminimum)
                temminimum = array[i];
            i++;
        }
        return temminimum;
    }
    public static int minima(int [] array){
        int m = 0;
        int i=1;
        while ( i < array.length)
        {
            if (array[i] < array[m])
            {
                m = i;
            }
            i++;
        }
        return m;
    }

    static int count = 0;
    static boolean compare(int x, int y)
    {
        count++;
        return x > y;
    }

        int [][] arr1 = new int[][]{{342,34,233,456},{123,23,1,567}};
        System.out.println(maximum(arr1));
    }
}