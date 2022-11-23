public class Q9
{

    public static void hello(int size){
        for(int i=1; i<=size; i++){
            
            for(int j=1; j<=size; j++){
                if(j <= i)
                System.out.print(i);
                else
                System.out.print(1);
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int size = 5;
		hello(size);
	}
}
