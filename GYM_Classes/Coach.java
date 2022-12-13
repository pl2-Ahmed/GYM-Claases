package GYM_Classes;

import java.util.*;

public class Coach extends User {
    /*start data fields*/
    private double salary;
    /*end data fields*/
    //***********************************************************************
    /* start constractoers */
    public Coach(int id, String firstName, String lastName, String email, String password, String address, String phoneNumber, Date birthDate, double salary)
    {
        super( id , firstName , lastName , email , password , address , phoneNumber , birthDate );
        this.salary = salary;
    }
    /* end constractoers */
    //***********************************************************************
    /*start seter*/

    public void setSalary(double salary) {
        this.salary = salary;
    }
    /*start seter*/
    //***********************************************************************
    /*start geter*/

    public double getSalary() {
        return salary;
    }
    /*end geter*/
    //***********************************************************************
}
