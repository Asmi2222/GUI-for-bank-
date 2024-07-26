
/**
 * Write a description of class CreditCard here.
 *
 * @author (22068053 Asmi Bajracharya)
 * @version (1.0.0)
 */
//subclass of BankCard
public class CreditCard extends BankCard
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate; 
    private int gracePeriod;
    private boolean isGranted; 
    //constructor with parameters 
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, 
    int balanceAmount, int cvcNumber,double interestRate,String expirationDate){
        //calls superclass
        super(cardId,issuerBank, bankAccount, balanceAmount);
        //setter method 
        setclientName(clientName);
        //assignment of values 
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    //method : getter (accessor method)
    public int getcvcNumber(){
        return this.cvcNumber;
    }
    public double getcreditLimit() {
        return this.creditLimit;
    }
    public double getinterestRate() {
        return this.interestRate;
    }                               
    public String getexpirationDate() {
        return this.expirationDate;
    }
    public int getgracePeriod() {
        return this.gracePeriod;
    }
    public boolean getisGranted() {
        return this.isGranted;
    }
    //method sets credit limit 
    public void setcreditLimit(double creditLimit, int gracePeriod){
        if (creditLimit <= 2.5 * getbalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted= true;   
        } else {
            System.out.println("Credit is not granted.");
        }
    }
    public void cancelCreditCard(){
        this.cvcNumber = 0;
        this.creditLimit= 0;
        this.gracePeriod = 0;
        this.isGranted= false;   
    }
    // display method 
    public void display(){
        super.display();
        //condition applied
        if (isGranted == true) {
            //called from BankCard
            System.out.println("CVC number = "+ cvcNumber );
            System.out.println("Credit limit = " + creditLimit);
            System.out.println("Interest rate = " + interestRate);
            System.out.println("Expiration date = " + expirationDate);
            System.out.println("Grace period = " + gracePeriod);
        } else {
            //CreditLimit and GracePeriod not displayed
            System.out.println("CVC number = "+ cvcNumber );
            System.out.println("Interest rate = " + interestRate);
            System.out.println("Expiration date = " + expirationDate);
        }
    }
}






