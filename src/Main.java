public class Main
{
    public static void main(String[] args)
    {
        double salary = 455678.12345;
        int age = 18;
        String name = "Andrew Hoffbauer";
        for(int x = 0; x < 15;x++) {
            System.out.printf("\n%-20s%5d%12.2f", name, age, salary);
        }
    }
}