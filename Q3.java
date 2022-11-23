public class Q3
{

    public static void hello(int size){
        for(int i=0; i<4; i++){
            
            for(int j=0; j<=(size); j++){
                System.out.print("*");
            }
            size--;
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int size = 5;
		hello(size);
	}
}
