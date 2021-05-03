package Course9;

public class Mistake3 {
    public static void divide(int one,int two)throws Exception {
        if(two == 0){
            throw new Exception("除数不能为零");
        }else{
            System.out.println("结果为："+one/two);
        }

    }

    public static void main(String[] args) {
        try {
            divide(10,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
