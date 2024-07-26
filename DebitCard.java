
/**
 * Write a description of class DebitCard here.
 *
 * @author (22068053 Asmi Bajracharya)
 * @version (1.0.0)
 */
//subclass of BankCard
public class DebitCard extends BankCard
{  
    //attributes 
    private int pinNumber;
    private int withdrawalAmount; 
    private String dateOfWithdrawal; 
    private boolean hasWithdrawn;
    
    //constructor with parameters 
    public DebitCard(int cardId,String clientName,String issuerBank,String bankAccount,int balanceAmount,
    int pinNumber){
        // calls superclass
        super(cardId,issuerBank,bankAccount,balanceAmount);
        //set
        setclientName(clientName);
        //assignment of values 
        this.pinNumber=pinNumber;
        this.hasWithdrawn=false;
    }
    //method : getter (accessor method)
    public int getpinNumber(){
        return this.pinNumber;
    }
    public int getwithdrawalAmount(){
        return this.withdrawalAmount;
    }
    public String getdateOfWithdrawal(){
        return this.dateOfWithdrawal;
    }
    public boolean gethasWithdrawn(){
        return this.hasWithdrawn;
    }
        
    // mutator method 
    public void setwithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber){
        // conditions apply
        if(this.pinNumber==pinNumber && withdrawalAmount <= getbalanceAmount()){
            // sets new balance amount 
            setbalanceAmount( getbalanceAmount() - withdrawalAmount );
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal=dateOfWithdrawal;
            this.hasWithdrawn = true;
        } else {
            System.out.println("Pin number invalid or not sufficent balance amount");
                
        }
    }
    // display method
    public void display(){
        //called from BankCard
        if (hasWithdrawn == true) {
            super.display();
            System.out.println("Pin number = " + pinNumber);
            System.out.println("Withdrawal amount = " + withdrawalAmount);
            System.out.println("Date of withdrawal = " + dateOfWithdrawal);
        } else {
            System.out.println("Balance Amount = " + getbalanceAmount());
        }
    }
}


    
    
    