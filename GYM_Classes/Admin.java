package GYM_Classes;

import java.util.Date;

public class Admin extends User {
    /*start data fields*/
    double sallary;
    /*end data fields*/
    //***********************************************************************
    /* start constractoers */
    public Admin(int id, String filrstName, String lastName, String email, String password, String address, String phoneNumber, Date birthDate, double sallary)
    {
        super( id , filrstName , lastName , email , password , address , phoneNumber , birthDate );
        this.sallary = sallary;
    }
    /* end constractoers */
    //***********************************************************************
    /*start seter*/

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
    /*start seter*/
    //***********************************************************************
    /*start geter*/

    public double getSallary() {
        return sallary;
    }
    /*end geter*/
    //***********************************************************************
}
