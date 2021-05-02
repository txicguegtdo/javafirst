package Course8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        Map hashMap = new HashMap<>();
        hashMap.put("name1","zhangsan");
        hashMap.put("name2","lisi");
        hashMap.put("name","wangwu");
        System.out.println(hashMap.size());
        //遍历
        Iterator iter=hashMap.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry name =(Map.Entry)iter.next();
            String namekey = (String)name.getKey();
            String nameValue = (String)name.getValue();
            System.out.println(namekey+"'s name is "+nameValue);
        }
        //遍历2
        //hashMap.forEach((key,value)-> {
           // System.out.println("[key:" + key + ",value=" + value + "]");
        //});

    }

}
