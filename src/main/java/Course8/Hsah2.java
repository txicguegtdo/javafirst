package Course8;

import org.omg.CORBA.StringHolder;

import java.util.HashMap;
import java.util.Map;

public class Hsah2 {
    public static void main(String[] args) {
        //map类，<>内部为hashmap的key value，key为一个值，可以是string，int类型，而value可以是一个对象，也可以是简单的值，也可以是hashmap
        Map<String,Teacher>hashMap = new HashMap<>();
        Map<String,Teacher>hashMap2 = new HashMap<>();
        Teacher ye = new Teacher();
        Teacher jiao = new Teacher();
        Teacher ff = new Teacher();
        ye.setAge(10);
        ye.setName("yeb");
        hashMap.put(ye.getName(),ye);

        jiao.setName("ge");
        jiao.setAge(20);
        hashMap.put(jiao.getName(),jiao);

        ff.setAge(18);
        ff.setName("方法");
        hashMap2.put(ff.getName(),ff);

        String str = "yeb";
        System.out.println(hashMap.get(str).getAge());//get(str)得到一个key 属性

        Map<String,Map<String ,Teacher>>hashMap4 = new HashMap<>();
        hashMap4.put("a",hashMap);
        hashMap4.put("b",hashMap2);
        System.out.println(hashMap4.get("a").get("yeb").getAge());
    }
}
