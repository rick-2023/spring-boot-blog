package XML.proxy;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 14:18.
 */
public class AccountProxy implements Account {
    private Account account;

    public AccountProxy(Account account) {
        super();
        this.account = account;
    }

    @Override
    public void queryAccount() {
        System.out.println("代理before");
        account.queryAccount();
        System.out.println("代理after");
    }

    @Override
    public void updateAccount() {
        System.out.println("代理before");
        account.updateAccount();
        System.out.println("代理after");
    }
}
