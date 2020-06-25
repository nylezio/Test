package proxytest;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/05/14 17:17
 */
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("已经保存");
    }
}
