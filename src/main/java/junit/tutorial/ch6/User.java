package junit.tutorial.ch6;

public class User {

    private String name = "nobody";
    private boolean admin = false;

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
