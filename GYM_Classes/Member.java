package GYM_Classes;
import java.util.Date;

public class Member extends User {
    /*start data fields*/
    private Date dateSubscriptionStart;
    private Date dateSubscriptionEnd;
    private int coachId;
    private double SubscriptionPrice;
    private double weight;
    private double height;
    /*end data fields*/
    //***********************************************************************
    /* start constractoers */
    public Member(int id,String name,String password,Date dateSubscriptionEnd,double SubscriptionPrice,double weight,double height,int coachId){
        super(id,name,password);
        this.dateSubscriptionEnd = dateSubscriptionEnd;
        this.SubscriptionPrice = SubscriptionPrice;
        this.height = height;
        this.weight = weight;
        this.coachId = coachId;
        dateSubscriptionStart = new Date();
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
