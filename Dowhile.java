import java.util.Scanner;
class Dowhile {
    
    
    public static void main(String[] args) {
        
        /*int i=0;
        do{
            System.out.println("hello wolrd" +i);
            i=i+1;
        }
        while(i<0);*/

        /*int sum=0;
        int i=1;
        do{
            sum=sum+i;
            i++;
        }
        while(i<=10);
        System.out.println("sum of 10 natural number = " + sum);*/
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter your number");
        n=sc.nextInt();
        int i=1;
        int sum=0;
        do{
            sum=sum+i;
            i++;
        }
        while(i<=n);
        System.out.println("sum of "+n+" natural number = " + sum);


    }
}
