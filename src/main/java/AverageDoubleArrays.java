public class AverageDoubleArrays {


// Complete these methods

    public double count(double[] aa) {

        return (double)aa.length;
    }

    public double sum(double[] aa) {
        double sum=0;
        for(int i=0; i<aa.length; i++){
            sum+=aa[i];
        }
        return sum;
    }

    public double average(double[] aa) {
        try{
            return sum(aa)/count(aa);
        }catch(ArithmeticException ea){
            System.out.println("Arithmetic Exception Occurred!");
            return (double) 0;
        }

    }

}
