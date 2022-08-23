public class ArrayUtills {

    public int findMax(int[] array) {
        int max = array[0];

        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public  double div( double a , double b){
        if (b == 0){
            throw new ArithmeticException();
        }
        if (a < b){
            return b / a;
        }
        return a / b;
    }
}
