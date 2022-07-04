package de.neeroxz.user;

import java.util.ArrayList;

public class UserHolder {
    ArrayList<User> userList = new ArrayList<>();

    public UserHolder(){
        initUser();
    }

    private void initUser() {
        userList.add(new User("Nick", "Obreiter","neeroxz@hotmail.de", "NeeroxZ"));
        userList.add(new User("Kevin", "Jobst","kevin.jobst@hotmail.de", "jokvn"));
        userList.add(new User("Kevin", "Test","kevin.test@hotmail.de", "test"));
        userList.add(new User("Kevin", "Test2","kevin.test2@hotmail.de", "test2"));
        userList.add(new User("Kevin", "Test3","kevin.test3@hotmail.de", "test3"));
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
}
