/*Everything in Java is passed by value. In case of an array (which is nothing but an Object), the array reference is passed by
  value (just like an object reference is passed by value).

  When you pass an array to other method, actually the reference to that array is copied.

  Any changes in the content of array through that reference will affect the original array.

  But changing the reference to point to a new array will not change the existing reference in original method.

 */

public class question8 {

    public static void changeContent(int[] arr) {

        // If we change the content of arr.
        arr[0] = 10;  // Will change the content of array in main()
    }

    public static void changeRef(int[] arr) {

        // If we change the reference
        arr = new int[2];  // Will not change the array in main()
        arr[0] = 15;
    }

    public static void main(String[] args) {
        int [] arr = new int[2];
        arr[0] = 4;
        arr[1] = 5;

        changeContent(arr);

        System.out.println(arr[0]);  // Will print 10..

        changeRef(arr);

        System.out.println(arr[0]);  // Will still print 10..
        // Change the reference doesn't reflect change here..
    }
}