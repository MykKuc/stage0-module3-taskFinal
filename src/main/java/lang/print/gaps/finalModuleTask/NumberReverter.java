package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int digit1 = number/100;

        int digit22 = number%100;
        int digit2 = digit22/10;

        int digit3 = number%10;

        System.out.println(digit3 + "" + digit2 + "" + digit1);
    }
}
