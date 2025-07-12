public class arrayCreation{
    public static void main(String args[]){
        int sub[]=new int[10];

        int marks[]={80,90,100};

        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
            System.out.print("marks="+ marks[i] +" ");
        }
    }
}