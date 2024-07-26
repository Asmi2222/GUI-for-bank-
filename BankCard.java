
/**
 * Write a description of class BankCard here.
 *
 * @author (22068053 Asmi Bajracharya)
 * @version (1.0.0)
 */
public class BankCard
{ 
    //attributes
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount ;
    
    //constructor with parameters 
    public BankCard (int cardId,String issuerBank,String bankAccount,int balanceAmount){
        //assigning values 
        this.cardId = cardId;
        this.issuerBank = issuerBank;
        this.bankAccount=bankAccount;
        this.balanceAmount=balanceAmount;
        //client name initialized to empty string
        this.clientName="";
    }
    //method : getter (accessor method)
    public int getcardId() {
        return this.cardId; 
    } 
    public String getissuerBank() {
        return this.issuerBank; 
    } 
    public String getbankAccount() { 
        return this.bankAccount;
    } 
    public int getbalanceAmount() { 
        return this.balanceAmount; 
    } 
    public String getclientName() { 
        return this.clientName; 
    } 
    //method : setter
    public void setclientName(String clientName){
        this.clientName=clientName;
    }
    public void setbalanceAmount(int balanceAmount){
        this.balanceAmount=balanceAmount;
    }
    //display method 
    public void display(){
        //if clientname not assigned 
        if (clientName==""){
            System.out.println("Invalid entry.The client name has not been entered.Please enter client name");
        }else{
            System.out.println("Card ID = " + cardId);
            System.out.println("Client Name = " + clientName);
            System.out.println("Issuer Bank = " + issuerBank);
            System.out.println("Bank Account = " + bankAccount);
            System.out.println("Balance Amount = " + balanceAmount);
        }
    }
}

    
    
    
    
    
    
    
    
    

