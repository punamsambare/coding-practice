import java.util.Arrays;
public class ConvertTheTemperature_2469 {
    public static void main(String[] args) {
        double celsius =36.50;
        
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }

    public static double[] convertTemperature(double celsius) {
       double k =  celsius + 273.15;
       double f = (celsius * 1.80) + 32.00;

       return new double[]{k,f};
    }
}
