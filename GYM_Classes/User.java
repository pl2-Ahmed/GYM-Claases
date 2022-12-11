package GYM_Classes;

abstract public class User {
    /* start data fields*/
    protected int id;
    protected String name;
    protected String password;
    /* end data fields*/
    //***********************************************************************
    /* start constractoers */
    //should be zero arg constructor bexause user will be extend
    public User(){

    }
    public User(int id,String name,String password){
        this.id         =       id;
        this.name       =     name;
        this.password   = password;
    }
    /* end constractoers */
    //***********************************************************************
    /*start seter*/
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /*start seter*/
    //***********************************************************************
    /*start geter*/

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    /*end geter*/
    //***********************************************************************
}
