public class BmiService {

    public int calculate(int weight, double height) {
        double  bmiIndex = weight / height;
        return (int)bmiIndex;

    }

}