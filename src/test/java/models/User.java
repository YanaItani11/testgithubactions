package models;

public class User {
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private String login;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
    private String name;
    public User(String username, String pwd){
        this.login = username;
        this.password = pwd;
    }

}
