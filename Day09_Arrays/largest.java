public class largest {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if (smallest>numbers[i]) {
                smallest=numbers[i];
            }

        }
        System.out.println("Smallest="+smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,4,8,5,27,3,2,25};
        System.out.println("largest="+getLargest(numbers));
    }
    
}
