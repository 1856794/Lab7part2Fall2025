import java.util.Arrays;
/**
 * creates an int[] array called myArray, with preset values
 * count() returns the number of values in the array
 *      through a for each loop
 * sum() returns the sum of the values in the array
 *      for loop
 * average() returns the average of the values in the array
 *      uses count() and sum()
 * findMax() is the largest value in myArray
 *      assigns a max int that goes through each value of myArray
 * findIndexOfMax() returns the largest index of the max
 *      uses loops that checks each value if equal to max then returns
 *      that index
 *
 * @author Robert Padilla
 * @version v1.0
 * @since 11/2/25
 */
public class ArrayMethods
{
    // instance variables - replace the example below with your own
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    

    /**
     * returns the number of values in myArray
     *
     * @return integer counter that counts values in array
     */
    public int count()
    {
        // put your code here
        int counter = 0;
        for(int array: myArray){
            counter++;
        }
        return counter;
    }
    
    /**
     * returns the sum of the values in myArray
     * 
     * @return int values for the sum of the values in the array
     */
    public int sum(){
        int sum = 0;
        for(int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        return sum;
    }
    
    /**
     * returns the average of the values in myArray using
     * sum and count methods
     *
     * @return double of the average values in the array
     */
    public double average (){
        return (double)sum()/count();
    }
    
    /**
     * returns the max value in myArray
     * 
     * @return max int value in myArray
     */
    public int findMax(){
        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > max)
                max = myArray[i];
        }
        return max;
    }
    
    /**
     * returns the index of the max value in the array
     * 
     * @return index integer of the max value
     */
    public int findIndexOfMax(){
        int index = 0;
        for(int i = 0; i < myArray.length; i++){
            
            if(myArray[i] == findMax()){
                index = i;
            }
        }
        return index;
    }
    
    /**
     * prints an int array, nicely formatted
     * @param inArray int array to print
     * 
     */
    public void print(int[] inArray){
        System.out.print("{");
            int i;
            for(i = 0; i < inArray.length - 1; i++){
                System.out.print(inArray[i] + ",");
            }
            if(inArray.length > 0){
                System.out.print(inArray[i]);
            }
            System.out.println("}");
    }
    
    /**
     * 
     * 
     */
    public int findLast(int key){
        int index = -1;
        for(int i = myArray.length -1; i >= 0; i --){
            if(myArray[i] == key){
                return i;
            }
        }
        return index;
    }
    
    /**
     * 
     * 
     */
    public int[] findAll(int key){
        int count = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == key){
               count ++; 
            }
        }
        int[] findAll = new int[count];
        int counter = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == key){
                findAll[counter] = i;
                counter++;
            }
        }
        return findAll;
    }
    
    /**
     * 
     * 
     */
    public int[] getArray(){
        return myArray;
    }
    
    /**
     * 
     * 
     */
    public int[] copyArray(){
        return Arrays.copyOf(myArray, myArray.length);
    }
    
    /**
     * 
     * 
     */
    public int[] reverseArray(int[] inArray){
        int count = 0;
        int[] temp = Arrays.copyOf(inArray, inArray.length);
        for(int i = inArray.length-1; i >= 0; i--){
            inArray[count] = temp[i];
            count++;
        }
        
        return inArray;
    }
}