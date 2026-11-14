public class ThirdLargest {

    public static void main(String[] args) {

        int arr[] = {10, 50, 30, 80, 60, 70};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {

                third = second;
                second = first;
                first = arr[i];

            } 
            else if (arr[i] > second && arr[i] != first) {

                third = second;
                second = arr[i];

            } 
            else if (arr[i] > third && arr[i] != second
                    && arr[i] != first) {

                third = arr[i];
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("Third largest element does not exist");
        } else {
            System.out.println("Third Largest: " + third);
        }
    }
}
