package exceptionHandling;

import java.util.Scanner;

class InvalidTemperatureException extends Exception{
    InvalidTemperatureException(String msg){
        super(msg);
    }
}

public class CustomException1 {

    public static void validateTemperature(double a) throws Exception {
        if(a<-273.15){
            throw new InvalidTemperatureException("validate temperature again");
        }else{
            System.out.println(a);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("enter the temp: ");
            double a = scanner.nextDouble();
            validateTemperature(a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        scanner.close();

    }

    }



