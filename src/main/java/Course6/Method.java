package Course6;

public class Method {
    //int x
    //pulic（公开 其他类也可以调用） static 返回类型 方法名称（自己取）（参数类型 变量 参数类型 变量){
    public static int bigger(int num1,int num2){
        //定义 num3
        int num3;
        if(num1>num2){
            num3 = num1;
        }else{
            num3 = num2;
        }
        return num3;
    }
    public static double bigger(double num1,double num2){
        double num3;
        if(num1>num2){
            num3 = num1;
        }else{
            num3 = num2;
        }
        return num3;
    }

    public static void main(String[] args) {
        int x = bigger(15,25);
        System.out.println(x);
        double y = bigger(20,40.24);
        System.out.println(y);
        tianti(6000);
    }
    public static void tianti(double num4){  //void不需要返回值
        if(num4>5000){
            System.out.println("lihai");
        }else if(num4>4000){
            System.out.println("yiban");
        }else{
            System.out.println("five");
        }
    }
}
