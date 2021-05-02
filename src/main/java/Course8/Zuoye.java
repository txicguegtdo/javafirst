package Course8;

import java.util.HashMap;
import java.util.Map;

public class Zuoye {
    public static void main(String[] args) {
        //刘备、关羽、张飞、花木兰，苏烈，百里守约，妲己，梦奇，裴擒虎，把这九个英雄用hashmap储存，放在同一个hashmap里面

        //百度关键词 王者荣耀，长城小分队，妖怪
        Map<String ,hero> H = new HashMap<>();
        Map<String ,hero> H2 = new HashMap<>();
        hero L = new hero();
        L.setName("刘备");
        L.setPower(90);
        H.put(L.getName(),L);

        hero Z = new hero();
        Z.setName("张飞");
        Z.setPower(95);
        H.put(Z.getName(),Z);

        hero G = new hero();
        G.setName("关羽");
        G.setPower(93);
        H.put(G.getName(),G);

        hero M = new hero();
        M.setPower(91);
        M.setName("花木兰");
        H.put(M.getName(),M);
        hero S = new hero();
        //刘备、关羽、张飞、花木兰，苏烈，百里守约，妲己，梦奇，裴擒虎，把这九个英雄用hashmap储存，放在同一个hashmap里面

        //百度关键词 王者荣耀，长城小分队，妖怪
        S.setPower(88);
        S.setName("苏烈");
        H.put(S.getName(),S);

        hero B = new hero();
        B.setName("百里守约");
        B.setPower(89);
        H.put(B.getName(),B);

        hero D = new hero();
        D.setName("妲己");
        D.setPower(96);
        H2.put(D.getName(),D);

        hero Q = new hero();
        Q.setName("梦奇");
        Q.setPower(80);
        H2.put(Q.getName(),Q);

        hero P = new hero();
        P.setName("裴擒虎");
        P.setPower(91);
        H2.put(P.getName(),P);

        Map<String ,Map<String,hero>> H3 = new HashMap<>();
        H3.put("长城小分队",H);
        H3.put("妖怪",H2);
        System.out.println(H3.get("长城小分队").get("刘备").getPower());


    }
}
