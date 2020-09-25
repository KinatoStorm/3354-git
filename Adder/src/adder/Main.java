package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide a few integers to add");
        }
    }

    private static int addArguments(String[] args) 
    {
	int length = args.length;
	int sum = 0;
        for(int i = 0; i < length; i++)
	{
		sum = sum + Integer.valueOf(args(i));
	}
	return sum;
    }
}
