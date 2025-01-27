package Model;

import Constants.ROLES;

public class Person {
    private String userName;
    private int age;
    private ROLES userRole;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ROLES getUserRole() {
        return userRole;
    }

    public Person(int age, String userName, ROLES userRole) {
        this.age = age;
        this.userName = userName;
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", userRole=" + userRole +
                '}';
    }

    public void setUserRole(ROLES userRole) {
        this.userRole = userRole;
    }
}
