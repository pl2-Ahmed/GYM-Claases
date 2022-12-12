package GYM_Classes;
import java.util.Date;
abstract public class User {
    /* start data fields*/
    private int id;
    //***************
    private Date birthDate;
    //********************
    private String filrstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private String password;
    //***************************
    /* end data fields*/
    //***********************************************************************
    /* start constractoers */
    //should be zero arg constructor bexause user will be extend
    public User(){

    }
    public User(int id,String filrstName,String lastName,String email,String password,String address,String phoneNumber,Date birthDate){
        this.id                     = id;
        this.filrstName             = filrstName;
        this.lastName               = lastName;
        this.email                  = email;
        this.password               = password;
        this.address                = address;
        this.phoneNumber            = phoneNumber;
        this.birthDate              = birthDate;
    }
    /* end constractoers */
    //***********************************************************************
    /*start seter*/
    public void setId(int id) {
        this.id = id;
    }

    public void setFilrstName(String filrstName) {
        this.filrstName = filrstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /*start seter*/
    //***********************************************************************
    /*start geter*/

    public int getId() {
        return id;
    }

    public String getFilrstName() {
        return filrstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*end geter*/
    //***********************************************************************
}
