package GYM_Classes;

import java.util.Date;

public class Admin extends User {
    /*start data fields*/
    double salary;
    /*end data fields*/
    //***********************************************************************
    /* start constractoers */
    public Admin(int id, String filrstName, String lastName, String email, String password, String address, String phoneNumber, Date birthDate, double salary)
    {
        super( id , filrstName , lastName , email , password , address , phoneNumber , birthDate );
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
