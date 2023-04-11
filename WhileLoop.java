public class WhileLoop {
    public static void main(String[] args) {
        /*int i=0;
        while(i<10){
            System.out.print("hello  ");
            System.out.println("world");
            i=i+1;}*/
        int sum=0;
        int k=0;
        while(k<=10){
            System.out.println(sum);
            sum=sum+k;       
        }
        
        int i=10;
        while(true){
            System.out.println(i*13+" "+i);
            if(i>90){
                break;
            }
            else{ 
                i=i*13;
            }     
            System.out.println("out");
        }


    }
    
}
