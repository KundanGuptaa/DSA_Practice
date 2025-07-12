public class pattern09 {
    public static void diamond(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop for space printing
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //inner loop for star printing
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop for mirroring
        for(int i=n;i>=1;i--){
            //inner loop for space printing
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //inner loop for star printing
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        diamond(10);
    }
}
