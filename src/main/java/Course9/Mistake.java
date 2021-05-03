package Course9;

public class Mistake {
    public static void main(String[] args) {
        try{
            String[] stu = {"l","h","i"};
            System.out.println(stu[3]);
        }
        //Catch块
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throm :"+e);
            System.out.println("数组越界");
            System.out.println("请输入正确的");
        }
    }
}
/*
try{
程序代码
}
catch(Exception e）{
Catch块
}
 */
