import java.util.*;

class ControlFlow{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("if...else : ");
        if(n>0)
        {
            System.out.println("Positive");
        }
        else if(n==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
        System.out.println("Switch : ");

            switch(n){
                case 1: System.out.println("Sunday");
                break;
                case 2: System.out.println("Monday");
                break;
                case 3: System.out.println("Tuesday");
                break;
                case 4: System.out.println("Wednesday");
                break;
                case 5: System.out.println("Thursday");
                break;
                case 6: System.out.println("Friday");
                break;
                case 7: System.out.println("Saturday");
                break;
                default: System.out.println("Invalid");
            }
            System.out.println();
        System.out.println("for loop : ");

        for(int i=1;i<=n;i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("while loop : ");

        while(n!=0)
        {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();
        System.out.println("do...while loop : ");

        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=3);

        sc.close();
    }
}