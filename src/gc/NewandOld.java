package gc;

/**
 * Created by zhaoguanjun on 2016/7/19.
 */
public class NewandOld {
    public static void main(String[] args){
        int _1MB = 1024 * 1024;
        //System.out.println("begin");
        byte[] a = new byte[200 * _1MB];
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end !");
    }
}
