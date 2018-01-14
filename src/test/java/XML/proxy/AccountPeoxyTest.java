package XML.proxy;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 14:19.
 */
public class AccountPeoxyTest {
    public static void main(String[] args) {
//        Account account = new AccountImpl();
//        AccountProxy proxy = new AccountProxy(account);
//        proxy.queryAccount();
//        proxy.updateAccount();
        Account account = (Account) new AccountProxyFactory().bind(new AccountImpl());
        account.queryAccount();
    }

}
