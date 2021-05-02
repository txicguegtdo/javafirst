package Course5;

public class Cat {
    private String name;
    private int age;
    private String sex;
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }



   /* public Cat(String name,int age){
        System.out.println("小猫的名字："+name);
        System.out.println("小猫的年龄："+age);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("java",1);
    }*/

   public Cat(){}

   public Cat(String name1,int age1){
       this.name=name1;
       this.age=age1;
   }
}


