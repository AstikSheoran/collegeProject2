public class Q2
{

    public static void hello(int size){
        int left, right;
        left = right = size;
        for(int i=0; i<left; i++){
           System.out.print("*");
        }
        System.out.print("Hello");
        for(int i=right-1; i>=0; i--){
            System.out.print("*");
        } 
    }
	public static void main(String[] args) {
		int size = 5;
		hello(size);
	}
}
