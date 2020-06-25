package proxytest;

/**
 * @author: codeJerry
 * @description: 静态代理
 * @date: 2020/05/14 17:18
 */
public class UserProxy implements IUserDao {

    IUserDao target;

    public UserProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("扩展1");
        target.save();
        System.out.println("扩展2");
    }
}
