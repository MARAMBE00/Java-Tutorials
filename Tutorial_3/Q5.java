public class Q5{
	
    public static void main(String[] args) {

        //1st star pattern
        for(int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //for extra line
        System.out.println();


        //2nd star pattern
        for(int i=1; i<=8; i++) {
            for(int j=1; j<i; j++)
                System.out.print(" ");
            for(int j=i; j<=8; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}