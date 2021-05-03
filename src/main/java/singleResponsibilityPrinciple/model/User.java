package singleResponsibilityPrinciple.model;

public class User {
    private String firstName;
    private String lastNamel;
    private String email;

    public User(String firstName, String lastNamel, String email) {
        this.firstName = firstName;
        this.lastNamel = lastNamel;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamel() {
        return lastNamel;
    }

    public void setLastNamel(String lastNamel) {
        this.lastNamel = lastNamel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
