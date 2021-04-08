public class BmiService {
    public double calculate(double height, double weight){
        double weightInMeter = height/100;
        double bmi = weight / Math.pow(weightInMeter, 2);
        return bmi;
    }

}
