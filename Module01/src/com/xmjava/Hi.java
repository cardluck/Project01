package com.xmjava;

/**
 * @author zd
 * @date 2020-04-13
 */
public class Hi {

    private String name;
    private String password;

    public  static void show(){
        HelloWorld.method();
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Hi(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hi{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
