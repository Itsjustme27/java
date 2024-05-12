public class ArrayAverage {
    public static void main(String[] args) throws Exception {
        int[] myArray = {2, -9, 0,5,12,-25,22,9,8,12,-100,234};
        int average = 0;
        int sum = 0;
        for(int i = 0; i < myArray.length; i++){
            sum = sum + myArray[i];
        }

        average = sum / myArray.length;
        System.out.printf("The average is : %d\n" , average);
    }
}
