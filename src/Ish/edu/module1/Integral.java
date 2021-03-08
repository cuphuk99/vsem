package Ish.edu.module1; 
/*
  @author   Ishtukin Vlad
  @project   vsem
  @class  Integral
  @version  1.0.0 
  @since 08.03.2021 - 19.43
*/

public class Integral {

    public static double getIntegral(double start, double finish, int steps, int cut){
        double step = (finish-start) / steps;
        double area = 0;
        double height = 0;
        for (int i = 0; i < steps; i++) {
            if (Math.sin(i*step)<0.1*cut) {
                height = Math.sin(i * step);
            } else {
                height = 0.1 * cut;
            }
                double currentArea = height * step;
                area = area + currentArea;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println("The area is " + getIntegral(0, Math.PI, 1000, 5));
    }
}