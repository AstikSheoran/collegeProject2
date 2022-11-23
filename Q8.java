public class Q8
{

    public static void hello(int size){
        for(int i=1; i<=size; i++){
            
            for(int j=1; j<=size; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int size = 5;
		hello(size);
	}
}
