package If;

public class IF3 {
    public static void main(String[] args) {
        if(10>5){
            System.out.println("1");
            if(10>11){
                System.out.println("2");
                if(10>7){
                    System.out.println("OK");
                }else{
                    System.out.println("else3");
                }
            }else{
                System.out.println("else2");
            }
        }else{
            System.out.println("else1");
        }
    }
}
