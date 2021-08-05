package Models;

public class user {
    private int id;
    private String name;
    private int age;
    private String username;
    private String passwd;
    private String address;
    private String email;
    private String sdt;

    public user(int id, String name, int age, String username, String passwd, String address, String email,String sdt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.username = username;
        this.passwd = passwd;
        this.address = address;
        this.email = email;
        this.sdt=sdt;
    }

    public user() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
