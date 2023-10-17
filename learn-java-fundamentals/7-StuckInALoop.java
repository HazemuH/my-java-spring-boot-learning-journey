public class StuckInALoop{
    public static void main(String[] args){

        //implementation of for and while for looping

        int i;
        //for(initialization ; expression ; update)
        for(i = 1 ; i < 10; i++){
            for(int j= 1; j <= i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int k = i;

        while(k > 0){
            for(int l = 1 ; l <= k ; l++){
                System.out.print("*");
            }
            System.out.println();
            k--;
        }
    }
}
