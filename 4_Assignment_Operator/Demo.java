// Airthmatic operator

public class Demo {
    public static void main(String args[]){
        int x = 16;
        int y = 5;

        boolean results = x<y;
        System.out.println(results);

        // conditional operators

        if(x>13 && x<=62)
        System.out.println("This is greater then 3");
        System.out.println("Bye");

        int x1 = 22;
        int x2 = 33;

        if(x1>x2){
            System.out.println(x1);
        }else{
            System.out.println(x2);
        }

        int n = 4;
        int result = 0;

        // if(n%2==0){
        //     result = 10;
        // }else{
        //     result = 20;
        // }

        result = n%2==0?10:20;

        System.out.println(result);
        int v = 3;
        switch(v){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Sutarday");
            break;
            case 7:
            System.out.println("Sunday");
            default:
            System.out.println("Enter valied value..");
        }

    }
}
