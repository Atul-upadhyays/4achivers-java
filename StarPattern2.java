class StarPattern2 {
    public static void main(String[]args){
        
        /*for(int i=0;i<=5;i++){
            for(int a=0;a<=i;a++){
                System.out.print(" ");}
            for(int b=5;b>i;b--){
                System.out.print(" *");
            }
            System.out.println();
       }*/
       /*for(int i=0;i<=5;i++){
        for(int c=0;c<=i;c++){
            System.out.print(" ");
        }
        for(int d=0;d<=0;d++){
            System.out.print("*");
        }
        System.out.println();
       }*/

       /*for(int i=0;i<=5;i++){
        for(int c=5;c>=i;c--){
            System.out.print(" ");
        }
        for(int d=0;d<=0;d++){
            System.out.print("*");
        }
        System.out.println();
       }*/

       for(int i=0;i<5;i++){
        for(int a=5;a>=i;a--){
            System.out.print(" ");
        }
        for(int b=0;b<=0;b++){
            System.out.print("*");
        }
        for(int b=0;b<=i-1;b++){
            System.out.print("  ");
        }
        for(int c=0;c<=0;c++){
            System.out.print("*");
        }
        System.out.println();
       }
       /*for(int i=0;i<=5;i++){
        if(i<=0){
            for(int a=0;a<=5;a++){
                System.out.print(" *");}}
        else if(i<=4){
            for(int b=0; b<=0;b++){
                System.out.print(" *");
            }
            for(int c=0;c<9;c++){
                System.out.print(" ");
            }
            for(int b=0; b<=0;b++){
                System.out.print("*");
            }

        }
        else {
            for(int a=0;a<=5;a++){
                System.out.print(" *");}}
        System.out.println();
       }*/
       

    }    
}
