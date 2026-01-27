public class ForLoop{
    public static void main(String args[]){
        int num=5;
        if(num>0){
        for(int i=1;i<=num;i++){
            System.out.println("Processing item "+i);
        }
        }
        else{
            System.out.println("No items to process");
        }
    }
}