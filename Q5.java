public class Q5
{

    public static void hello(int size){
        for(int i=0; i<size; i++){
            
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int size = 5;
		hello(size);
	}
}
