public class Q6
{

    public static void hello(int size){
        for(int i=0; i<size; i++){
            
            for(int j=0; j<size; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int size = 5;
		hello(size);
	}
}
