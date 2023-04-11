class NestedIfElse {
    public static void main(String[] args) {
        /*int a=90; //initialization
        int b,c; //multi decration
        int d=90, e=89; //mu;to initial
        b=78;
        c=67;*/

        boolean raining=true;
        boolean umbrella=false;
        boolean raincoat=true;
        boolean breakfast=false;
        boolean lunchbox=true;

        if(raining==true){
            if(umbrella==true){
                if(breakfast==true){
                    System.out.print("go to school");
                }
                else {
                    if(lunchbox==true){
                        System.out.println("go to school");
                    }
                    else {
                        System.out.println("don't go to school");
                    }
                }
                
            }}
            else {
                if(raincoat==true){
                    if(breakfast==true){
                        System.out.println("go to school");
                    }
                    else {
                        if(lunchbox==true){
                            System.out.println("go to school");
                        }
                        else {
                            System.out.println("don't go to school");
                        }

                }
            }

        else {
            if(breakfast==true){
                System.out.print("go to school");
            }
            else {
                if(lunchbox==true){
                    System.out.println("go to school");
                }
                else {
                    System.out.println("don't go to school");
                }
            }
        }
        
    }
    if(raining==true && (umbrella==true|| raincoat==true)){
        if(breakfast==true || lunchbox ==true){
            System.out.println("you can go to school");
        }
        else{
            System.out.println("you can not go to school");
        }
    }
    else{
        System.out.println("you cannot go to school");
    }
    }
}