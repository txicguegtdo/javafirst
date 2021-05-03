package Course10;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("item");
            arrayList.add(1, "item1");
            arrayList.add("item2");
            arrayList.add(3, "item3");
            arrayList.add(5, "ir");


            //检查元素位置
            int p = arrayList.indexOf("item2");
            System.out.println("位置" + p);
            //检查列表是否为空
            boolean c = arrayList.isEmpty();
            System.out.println("是否为空" + c);
            //获取列表的长度
            int s = arrayList.size();
            System.out.println("长度" + s);
            //检查是否包含元素
            boolean e = arrayList.contains("i");
            System.out.println("是否包含" + e);
            //获取指定位置上的元素
            String I = arrayList.get(1);
            System.out.println("1位置上是" + I);
            //替换元素
            arrayList.set(1, "B");
            System.out.println(arrayList);
            //移除第几个位置元素
            arrayList.remove(3);
            System.out.println(arrayList);
            //移除第一次找到的item
            arrayList.remove("item");
            System.out.println(arrayList);
        }catch (Exception e){
            System.out.println("请按顺序");
        }
    }
}
