package LoginSystem;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    public IDandPasswords() {

        logininfo.put("username", "pass");
        logininfo.put("username1", "pass1");
        logininfo.put("username2", "pass2");
        logininfo.put("username3", "pass3");
    }

    public HashMap getLogininfo() {
        return logininfo;
    }
}
