import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        return (double)aa.size();
    }
    public Double sum(ArrayList<Double> aa) {
        double sum=0;
        for(int i=0; i<aa.size(); i++){
            sum+=aa.get(i);
        }
        return sum;
    }
    public Double average(ArrayList<Double> aa) {
        try{
            return sum(aa)/count(aa);
        }catch(ArithmeticException ea){
            System.out.println("Arithmetic Exception Occurred!");
            return (double) 0;
        }

    }

}
