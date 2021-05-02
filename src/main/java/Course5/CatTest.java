package Course5;

public class CatTest {
   public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAge(1);
        cat1.setName("Java");
        cat1.setSex("母");
        cat1.setWeight("1kg");

        System.out.println("小猫的名字："+cat1.getName());
        System.out.println("小猫的名字："+cat1.getAge());
        System.out.println("小猫的xingbie："+cat1.getSex());
        System.out.println("小猫的名字："+cat1.getWeight());

        for (int i = 0;i<5;i++){
            System.out.println("       ");
       }
       Cat cat2 = new Cat();
       cat1.setAge(3);
       cat1.setName("ava");
       cat1.setSex("gong");
       cat1.setWeight("10kg");

       System.out.println("小猫的名字："+cat1.getName());
       System.out.println("小猫的名字："+cat1.getAge());
       System.out.println("小猫的xingbie："+cat1.getSex());
       System.out.println("小猫的名字："+cat1.getWeight());

       Cat cat3 = new Cat("java",1);
       System.out.println(cat3.getName());
    }
}
