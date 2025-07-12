public class printingSubArrays {
    public static void subArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arrays[]={3,4,5,6,7,8,9};
        subArray(arrays);
    }
    
}
