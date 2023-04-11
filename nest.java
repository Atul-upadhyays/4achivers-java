class nest {
    public static void main(String[]args){
        //ternary operator
        int a=90;
        int b=70;
        
        int c = a>b?a+b:a-b;
        System.out.println(c);

        int r = (a>b)||(a>100 && a<200) ? a+29:a+59;
        System.out.println(r);

    }
    
} 
