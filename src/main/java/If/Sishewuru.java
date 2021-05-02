package If;

public class Sishewuru {
    public static void main(String[] args) {
        double a =20.76;
        int b =(int)a;
        double c;
        c = a - b;
        if(c>0.5){
            b = b+1;
            System.out.println(b);
        }else{
            System.out.println(b);
        }
    }
}
