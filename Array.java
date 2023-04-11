import java.util.Scanner;
class Array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int []marks = new int[10];
        marks[0]= 90;
        marks[1]= 12;
        marks[2]= 34;
        marks[3]= 90;
        /*for(int i=0; i<=9; i++){
            System.out.println(marks[i]);
        }*/
        /*for(int i=0; i<marks.length; i++){
            System.out.println(i+ "value  =");
            marks[i] = sc.nextInt();

        }*/
        /*int sum =0;
        for(int i=0; i<=9; i++){
            sum = sum +marks[i];
            System.out.println(sum);
        }*/
        int sum =0;
        for(int i=0; i<=9; i++){
            sum = sum +marks[i];
            System.out.println(sum);
        }
        double mark[] = [4.4,545.45,56.54];
        for(int i=0; i<mark.length; i++){
            System.out.println(i+ "value  =");
            mark[i] = sc.nextInt();}

    }

}
