package test;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/19 16:42
 */
class User{
    private int id;

    public User(int id) {
        this.id = id;
    }
}
public class HashValue {
    public static void main(String[] args) {
        User user = new User(1);
        System.out.println(user);
        System.out.println(user.hashCode());
    }

}
