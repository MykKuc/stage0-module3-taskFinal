package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int digit1 = number/1000;

        int digit22 = number%1000;
        int digit2 = digit22/100;

        int digit33 = number%100;
        int digit3 = digit33/10;

        int digit4 = number%10;


        System.out.println(digit1 + digit2 + digit3 + digit4);
    }
}
