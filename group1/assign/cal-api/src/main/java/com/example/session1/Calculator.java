public class Calculator
{
    public static int addTwoNums(int num1, int num2)
    {
        return num1 + num2;
    }
    public static int subtractTwoNums(int num1, int num2)
    {
        return num1 - num2;
    }
    public static int multiplyTwoNums(int num1, int num2)
    {
        return num1 * num2;
    }
    public static int divideTwoNums(int num1, int num2)
    {
        int result = 0;

        try
        {
            result = num1 / num2;
        }
        catch(ArithmeticException exception)
        {
            System.out.println("Divisor can't be Zero or less then Zero!");
            return -1;
        }

        return result;
    }
}