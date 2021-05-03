package Course10;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("wangwu");
        arrayList.add("lisi");
        arrayList.add("zhao");
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        //遍历
        Iterator iterator =arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
