package Course9;

public class MIstake2 {
    public static void main(String[] args) {
        try{
            int i = 10 / 0;
            //try  出错就不会执行下面的语句 直接跳转到catch块
            System.out.println("式子对");
        }
        catch (Exception e){
            System.out.println("出错了");
        }
        //不管怎么样都会执行一次
        finally {
            System.out.println("lala");
        }
    }
}
