package test;


import org.junit.Test;

/**
 * @author: codeJerry
 * @description: 测试String
 * 开发中建议使用stringBuffer
 * 线程安全，效率不是很高
 * StringBuilder效率较高但是线程不安全
 * 增append删delete改replace
 * 查charAt插insert长度length遍历for
 * @date: 2020/04/06 23:01
 */
public class StringTest {

    @Test
    public void SringT(){
        StringBuffer stringBuffer = new StringBuffer(30);
        stringBuffer.append("abc");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        stringBuffer.insert(2, "defg");
        //反转
        System.out.println(stringBuffer.reverse());
        String string = ("123");
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)>'0' && string.charAt(i)<'9'){
                System.out.println(string.charAt(i));
            }
        }
    }
}

