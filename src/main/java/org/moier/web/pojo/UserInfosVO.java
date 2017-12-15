package org.moier.web.pojo;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:42 2017/12/14
 */
public class UserInfosVO {

    private String userName;
    private String password;
    private int age = 10;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
