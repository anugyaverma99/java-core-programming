public class WhileLoop{
    public static void main(String args[]){
        int num=3;
        if(num<=0){
            System.out.println("No stock available");
        }
        else{
            while(num>0){
                System.out.println("Item sold, stock left: "+(--num));
               
            }
        }
    }
}