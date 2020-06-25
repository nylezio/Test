package proxytest;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/05/14 17:19
 */
public class ProxyTest {
    public static void main(String[] args) {
        System.out.println("----------静态------");
        IUserDao target = new UserDao();

        UserProxy userProxy = new UserProxy(target);

        userProxy.save();

        System.out.println("--------动态-----------");
        System.out.println(target.getClass());
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
    }
}
