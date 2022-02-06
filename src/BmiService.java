public class BmiService {
    public double calculate(double weight, double height) {
        //weigh - масса указанная в кг
        //heigh - рост указанный в метрах
        return weight / Math.pow(height, 2);
    }
}