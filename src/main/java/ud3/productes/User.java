package ud3.productes;

public class User {
    private final String username;
    private final String name;
    private final String surname;
    private String address;
    private String email;

    public User(String username, String name, String surname, String address, String email) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
