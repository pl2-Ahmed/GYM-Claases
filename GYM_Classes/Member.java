package GYM_Classes;
import java.util.Date;

public class Member extends User {

    /*start data fields*/
    private int coachId;
    //*****************
    private Date dateSubscriptionStart;
    private Date dateSubscriptionEnd;
    //******************
    private double SubscriptionPrice;
    private double weight;
    private double height;
    //*******************
    /* static varuables*/
    private static int numOfMembers;

    /*end data fields*/
    //***********************************************************************
    /* start constractoers */
    public Member(int id,String firstName,String lastName,String email,String password,String address,String phoneNumber,Date birthDate,Date dateSubscriptionEnd,double SubscriptionPrice,double weight,double height,int coachId){
        super( id , filrstName , lastName , email , password , address , phoneNumber , birthDate );
        this.dateSubscriptionEnd = dateSubscriptionEnd;
        this.SubscriptionPrice = SubscriptionPrice;
        this.height = height;
        this.weight = weight;
        this.coachId = coachId;
        dateSubscriptionStart = new Date();
        numOfMembers++;
    }
    /* end constractoers */
    //***********************************************************************
    /*start seter*/

    public void setDateSubscriptionEnd(Date dateSubscriptionEnd) {
        this.dateSubscriptionEnd = dateSubscriptionEnd;
    }

    public void setSubscriptionPrice(double subscriptionPrice) {
        SubscriptionPrice = subscriptionPrice;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public void setDateSubscriptionStart(Date dateSubscriptionStart) {
        this.dateSubscriptionStart = dateSubscriptionStart;
    }

    /*start seter*/
    //***********************************************************************
    /*start geter*/
    public Date getDateSubscriptionEnd() {
        return dateSubscriptionEnd;
    }

    public Date getDateSubscriptionStart() {
        return dateSubscriptionStart;
    }

    public double getSubscriptionPrice() {
        return SubscriptionPrice;
    }

    public int getCoachId() {
        return coachId;
    }
    /*end geter*/
    //***********************************************************************
}
