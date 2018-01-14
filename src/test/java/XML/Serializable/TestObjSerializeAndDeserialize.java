package XML.Serializable;

import java.io.*;

/**
 * @author 范正荣
 * @Date 2017/10/2 0002 10:14.
 */
public class TestObjSerializeAndDeserialize {
    public static void main(String[] args) throws Exception {
        SerializePerson();
        Person p = DeserializePerson();
        System.out.println(p.getAge()+p.getName()+p.getSex());
    }

    public static void SerializePerson() throws IOException {
        Person person = new Person();
        person.setAge(11);
        person.setName("aaa");
        person.setSex("男");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("test.txt")));
        oos.writeObject(person);
        System.out.println("对象序列化成功");
        oos.close();
    }

    public static Person DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("test.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return person;
    }

}
