class StarPattern {
        public static void main(String[] args) {
            for(int i=0; i<6; i++){

                /*for(int l=4; l>=i; l--){
                    System.out.print("*");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                System.out.println();
            }*/

                /*for(int j=1; j<=i; j++){
                    System.out.print("*");
                    }
                    System.out.println();*/
                

                /*for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                for(int l=4; l>=i; l--){
                    System.out.print("*");                
                }
                System.out.println();*/
                
                for(int l=4; l>=i; l--){
                    System.out.print(" "); }

                for(int l=1; l<=i; l++){
                        System.out.print(" *");}

                System.out.println( );}

            for(int i=0; i<5; i++){
                for(int l=4; l>=i; l--){
                    System.out.print(" "); }

                for(int l=1; l<=i; l++){
                    if(i==1){
                        System.out.print(" D");}
                    else if(i==2){
                        System.out.print(" C");}
                    else if(i==3){
                        System.out.print(" B");}
                    else {
                            System.out.print(" A");}
                    }
                        System.out.println( );
                } 
    }
}