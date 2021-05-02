package Xunhuan;

public class Dowhile {
    public static void main(String[] args) {
        int a =10;
        do{
            a++;
            System.out.println(a);
            if (a==16)
                break;
        }
        while (a<20);
    }
}
