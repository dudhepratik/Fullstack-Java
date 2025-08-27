 Q1)  Create an array of integers, store elements in it, and display the elements:
- In forward order (from first to last)
- In backward order (from last to first)
 Example Input:
Array = [10, 20, 30, 40, 50]
 Expected Output:
Forward: 10 20 30 40 50
Backward: 50 40 30 20 10
==>
    class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        // Forward order
        System.out.print("Forward: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Backward order
        System.out.print("Backward: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
