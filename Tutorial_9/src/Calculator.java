public class Calculator {

    private int sumValue;
    private int subtractValue;
    private int divideValue;
    private int multiplyValue;
    private double squareRootValue;

    public int addition(int A, int B){
        sumValue = A + B;
        return sumValue;
    }

    public int subtraction(int C, int D){
        subtractValue = C - D;
        return subtractValue;
    }

    public int division(int E, int F){
        if(!(E == 0)||(F == 0)) {
            divideValue = E / F;
        }
        else{
            System.out.println("E and F cannot be zero.");
        }
        return divideValue;
    }

    public int multiplication(int G, int H){
        if(!(G == 0)||(H == 0)) {
            multiplyValue = G * H;
        }
        else{
            System.out.println("G and H cannot be zero.");
        }
        return multiplyValue;
    }

    public double squareRoot(double X){
        squareRootValue = Math.sqrt(X);
        return squareRootValue;
    }

}
