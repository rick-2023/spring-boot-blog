package XML.Serializable;

import java.io.Serializable;

/**
 * @author 范正荣
 * @Date 2017/10/2 0002 10:12.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 3166183946753658087L;
    private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
