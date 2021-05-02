package Course7;

import java.text.DecimalFormat;

public class Shuzu {
    public static void main(String[] args) {
        double[] list = {1,2,3,4,5};
        //System.out.println(list[0]);
        int size = 5;
        double[] mylist = new double[size];
        mylist[0] = 5.6;
        mylist[1] = 4.5;
        mylist[2] = 3.3;
        mylist[3] = 13.2;
        mylist[4] = 4.67;

        double t = 0;
        for(int i = 0;i < size;i++){
            t += mylist[i];
        }
        //System.out.println(t);
        //保留两位小数
        //DecimalFormat d = new DecimalFormat("#.00");
        //System.out.println("mylist和:"+d.format(t));
        //遍历数组
        /*for(int i = 0;i<mylist.length;i++){
            System.out.println(mylist[i]);
        }*/
        //加强型
        /*for(double e:mylist){
            System.out.println(e);
        }*/
        //二维数组
        double[][] mylist1 = new double[2][];
        mylist1[0] = new double[2];
        mylist1[1] = new double[3];
        mylist1[0][0] = 1;
        mylist1[0][1] = 2;

        double[] l = {34.4,51.2,23.1,56.2,35};
        double m = 0;
        for(int i = 0;i<l.length;i++){
            if(l[i]>m){
                m = l[i];
            }
            System.out.println(m);
        }

    }
}
