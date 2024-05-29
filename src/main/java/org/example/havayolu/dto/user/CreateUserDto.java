package org.example.havayolu.dto.user;

public class CreateUserDto {
    private String name;
    private String lastname;
    private String tc;
    private String number;
    private String password;

    public CreateUserDto(String name, String lastname, String tc, String number, String password) {
        this.name = name;
        this.lastname = lastname;
        this.tc = tc;
        this.number = number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
