package Lambda.Java8;

/**
 * @author 范正荣
 * @Date 2017/10/3 0003 10:45.
 */
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
