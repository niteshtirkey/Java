class Calculator{
        int a;

        public int add(int n1, int n2){
            // System.out.println("in add");
            int r = n1 + n2;
            return r;
        }
}


public class Demo {

    public static void main(String a[]) {
        {
            int num1 = 400;
            int num2 = 500;

            Calculator calc = new Calculator();
            int results = calc.add(num1, num2);

            System.out.println(results);
        }
    }
}