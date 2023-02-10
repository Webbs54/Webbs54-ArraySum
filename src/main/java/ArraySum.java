public class ArraySum {
    /**
     * This method should return the sum of all ints in an array - this is a very useful trick to know!
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints
     * @return the sum of all values in arr.
     */
    public int sum(int[] arr)
    {
        int arr_sum = 0; // variable to hold sum.
        for (int i = 0; i < arr.length; i++)
        {
            arr_sum += arr[i]; // each value is added on.
        }
        return arr_sum;
    }
}
