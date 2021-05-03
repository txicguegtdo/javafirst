package Course9;

public class Mistake4 {
    public static void Tesr1(int x)throws ArrayIndexOutOfBoundsException,ArithmeticException{
        System.out.println(x);
        if(x == 0){
            System.out.println("没有异常");
        }
        else if(x==1){
            int[] a = new int[3];
            a[3] = 5;
            throw new ArrayIndexOutOfBoundsException();
        }
        else if(x==2){
            int i = 0;
            int j = 5/0;
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        try{
            Tesr1(0);
        }catch (ArithmeticException e){
            System.out.println("算术异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组异常");
        }
    }
}
