package test;

/**
 * @author: codeJerry
 * @description: 比较"."
 * @date: 2020/04/23 21:27
 */
public class StringTest1 {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '.'){
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
