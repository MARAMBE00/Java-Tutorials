public class Question5 {

    public static void main(String[] args) {

        int[] arrayList = new int[10];

        for (int i=0; i< arrayList.length; i++){
            arrayList[i] = (int)(Math.random()*100)+1;
        }

        arrayList = bubbleSort(arrayList);

        for(int i=0; i< arrayList.length; i++){
            if (i != arrayList.length - 1){
                System.out.println(arrayList[i] +" ");
            }
            else {
                System.out.println(arrayList[i]);
            }
        }
    }

    static int[] bubbleSort(int[] arrayList) {

        int space;
        boolean bubbleSort = true;

        while (bubbleSort) {

            bubbleSort = false;

            for (int i = 0; i < arrayList.length - 1; i++) {
                if (arrayList[i] > arrayList[i + 1]) {
                    space = arrayList[i];
                    arrayList[i] = arrayList[i + 1];
                    arrayList[i + 1] = space;
                    bubbleSort = true;
                }
            }
        }
        return arrayList;
    }
}
