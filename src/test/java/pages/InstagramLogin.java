package pages;

public class InstagramLogin extends InstagramInfoForTwoSection {
    private String userName;

    private String password;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

}
