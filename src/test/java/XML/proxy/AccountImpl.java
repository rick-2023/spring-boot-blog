package XML.proxy;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 14:17.
 */
public class AccountImpl implements Account {
    @Override
    public void queryAccount() {
        System.out.println("查询账户");
    }

    @Override
    public void updateAccount() {
        System.out.println("更新账户");
    }
}
