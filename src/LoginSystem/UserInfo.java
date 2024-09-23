package LoginSystem;

import java.util.HashMap;

// public class UserInfo {

//     HashMap<String, String> logininfo = new HashMap<String, String>();

//     public UserInfo() {

//         logininfo.put("username", "pass");
//         logininfo.put("username1", "pass1");
//         logininfo.put("username2", "pass2");
//         logininfo.put("username3", "pass3");
//     }

//     public HashMap getLogininfo() {
//         return logininfo;
//     }
// }

public abstract class UserInfo {
    private int[][] idandPass;

    // public abstract int[][] getLoginInfo();
    public abstract void test();
}
