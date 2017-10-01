package Proxy;

/**
 * @author 范正荣
 * @Date 2017/8/28 0028 下午 4:02.
 */
public class ShowMethods {
    public static void main(String[] args) throws Exception {
        Class<?> demo = Class.forName("Proxy.Person");
//        demo.getConstructors();
        Person per = (Person) demo.newInstance();
        per.setAge(111);
        per.setName("aaa");
        System.out.println(per);
    }
}
