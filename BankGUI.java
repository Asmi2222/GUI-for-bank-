/**
 * Write a description of class BankGUI here.
 *
 * @author (22068053 Asmi Bajracharya)
 * @version (1.0.0)
 */
//import statements
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

//
public class BankGUI implements ActionListener {
    // Declearing private instance variable
    private JFrame frame;
    //Declearing private instance variables (Labels)
    private JLabel cCancelCreditCard,cSetCreditLimitLabel,cCardIdLabel2,bankLabel,withdrawLabel,debitCardLabel,dCardIdLabel,dClientNameLabel,dIssuerBankLabel,dBankAccountLabel,dBalanceAmmountLabel,dPinNumberLabel,dCardIdLabel1,dWithdrawalAmountLabel,dWithdrawlDateLabel,dPinNumberLabel1,creditCardLabel,cCardIdLabel,cClientNameLabel,cCreditLimitLabel,cGracePeriodLabel,cCVCNumberLabel,cInterestRateLabel,cExpirationDateLabel,cIssuerBankLabel,cBankAccountLabel,cBalanceAmmountLabel,cCardIdLabel1 ;
    //Declearing private instance variables (Buttons)
    private JButton addDebitCardButton,setCreditLimitButton,addCreditCardButton,dDisplayButton,dClearButton,cancelCreditCardButton,clearButton,dWithdrawButton,cSetCreditLimitButton,cCancelCreditCardButton,cAddCreditCardButton,cDisplayButton ;
    //Declearing private instance variables (ComboBox)
    private JComboBox <String> dayList,monthList,yearList,dayComboBox,monthComboBox,yearComboBox,cDayComboBox,cMonthComboBox,cYearComboBox,cDayList,cMonthList,cYearList;
    //Declearing private instance variables (TextField)
    private JTextField cCardIdTxt2,dCardIdTxt,dClientNameTxt,dIssuerBankTxt,dBankAccountTxt,dBalanceAmmountTxt,dPinNumberTxt,dCardIdTxt1,dWithdrawalAmountTxt,dPinNumberTxt1,cCardIdTxt,cClientNameTxt,cIssuerBankTxt,cBankAccountTxt,cBalanceAmmountTxt,cCardIdTxt1,cCreditLimitTxt,cGracePeriodTxt,cCVCNumberTxt,cInterestRateTxt ;
    //Declearing arraylist of BankCard
    ArrayList<BankCard> arrayBankCard = new ArrayList<BankCard>();

    //BankCard 
    public BankGUI(){
        frame = new JFrame();
        //for Bank label 
        bankLabel = new JLabel("JOON BANK");
        //seting the bounds 
        bankLabel.setBounds(308, 0, 325, 38);
        //seting font 
        bankLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
        //adding frame 
        frame.add(bankLabel);

        //for debit card
        //Adding Label
        debitCardLabel = new JLabel("Debit Card");
        dCardIdLabel = new JLabel("Card Id:");
        dClientNameLabel = new JLabel("Client Name:");
        dIssuerBankLabel = new JLabel("Issuer Bank:");
        dBankAccountLabel = new JLabel("Bank Account:");
        dBalanceAmmountLabel = new JLabel("Balance Ammount:");
        dPinNumberLabel = new JLabel("PIN Number:");

        //Adding text Field
        dCardIdTxt = new JTextField();
        dClientNameTxt = new JTextField();
        dIssuerBankTxt = new JTextField();
        dBankAccountTxt= new JTextField();
        dBalanceAmmountTxt= new JTextField();
        dPinNumberTxt= new JTextField();

        //Adding buttons
        addDebitCardButton = new JButton("Add Debit Card");

        //Setting Bounds
        debitCardLabel.setBounds(13, 26, 325, 38);
        dCardIdLabel.setBounds(13, 57, 66, 18);
        dCardIdTxt.setBounds(116, 54, 209, 22);
        dClientNameLabel.setBounds(13, 86, 81, 22);
        dClientNameTxt.setBounds(116, 90, 209, 22);
        dIssuerBankLabel.setBounds(13, 120, 139, 22);
        dIssuerBankTxt.setBounds(116, 124, 209, 22);
        dBankAccountLabel.setBounds(390, 49, 161, 22);
        dBankAccountTxt.setBounds(503,53, 209, 22);
        dBalanceAmmountLabel.setBounds(390, 88, 120, 22);
        dBalanceAmmountTxt.setBounds(503,88, 209, 22);
        dPinNumberLabel.setBounds(390, 123, 83, 22);
        dPinNumberTxt.setBounds(503,123, 209, 22);
        addDebitCardButton.setBounds(582,168,136,20);

        //Adding Action Listener
        addDebitCardButton.addActionListener(this);

        //Adding Frame 
        frame.add(debitCardLabel);
        frame.add(dCardIdLabel);
        frame.add(dCardIdTxt);
        frame.add(dClientNameLabel);
        frame.add(dClientNameTxt);
        frame.add(dIssuerBankLabel);
        frame.add(dIssuerBankTxt);
        frame.add(dBankAccountLabel);
        frame.add(dBankAccountTxt);
        frame.add(dBalanceAmmountLabel);
        frame.add(dBalanceAmmountTxt);
        frame.add(dPinNumberLabel);
        frame.add(dPinNumberTxt);
        frame.add(addDebitCardButton);

        //setting  font
        debitCardLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 15));

        //setting colors
        debitCardLabel.setForeground(Color.decode("#0c59cf"));
        addDebitCardButton.setBackground(Color.decode("#cbe8ba"));

        //for withdrawl 

        //Adding label
        withdrawLabel = new JLabel("Withdraw");
        dCardIdLabel1 = new JLabel("Card Id:");
        dWithdrawalAmountLabel = new JLabel("Withdrawal amount:");
        dWithdrawlDateLabel = new JLabel("Withdrawl Date:");
        dPinNumberLabel1 = new JLabel("PIN Number:");

        //Declearing string array 
        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] year = {"2023", "2024", "2025", "2026","2027", "2028", "2029", "2030"};

        //Adding JCombobox
        dayComboBox = new JComboBox(day);
        monthComboBox = new JComboBox(month);
        yearComboBox = new JComboBox(year);
        dayList = new JComboBox(day);
        monthList = new JComboBox(month);
        yearList = new JComboBox(year);

        //Adding Text Field 
        dCardIdTxt1= new JTextField();
        dWithdrawalAmountTxt= new JTextField();
        dPinNumberTxt1 = new JTextField();

        //Adding Buttons
        dWithdrawButton = new JButton("Withdraw");
        dDisplayButton = new JButton("Display");
        dClearButton = new JButton("Clear");

        //Setting Bounds
        withdrawLabel.setBounds(16, 198, 325, 38);
        dCardIdLabel1.setBounds(15, 235, 204, 29);
        dCardIdTxt1.setBounds(138,235,209,22);
        dWithdrawalAmountLabel.setBounds(15,281,238,33);
        dWithdrawalAmountTxt.setBounds(138,281,209,22);
        dWithdrawlDateLabel.setBounds(381,235,244,33);
        dayList.setBounds(498,235,55,22);
        monthList.setBounds(563,235,72,22);
        yearList.setBounds(645, 235, 58, 22);
        dPinNumberLabel1.setBounds(381,281,244,33);
        dPinNumberTxt1.setBounds(498,281,209,22);
        dWithdrawButton.setBounds(495,339,126,22);
        dDisplayButton.setBounds(344,339,126,22);
        dClearButton.setBounds(638,339,126,22);

        //Adding Action Listener
        dWithdrawButton.addActionListener(this);
        dDisplayButton.addActionListener(this);
        dClearButton.addActionListener(this);

        //Adding frame
        frame.add(withdrawLabel);
        frame.add(dCardIdLabel1);
        frame.add(dCardIdTxt1);
        frame.add(dWithdrawalAmountLabel);
        frame.add(dWithdrawalAmountTxt);
        frame.add(dWithdrawlDateLabel);
        frame.add(dayList);
        frame.add(monthList);
        frame.add(yearList);
        frame.add(dPinNumberLabel1);
        frame.add(dPinNumberTxt1);
        frame.add(dWithdrawButton);
        frame.add(dDisplayButton);
        frame.add(dClearButton); 

        //setting font 
        withdrawLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 15));

        //setting colors
        withdrawLabel.setForeground(Color.decode("#0c59cf"));
        dWithdrawButton.setBackground(Color.decode("#fff1d7"));
        dDisplayButton.setBackground(Color.decode("#f7fade"));
        dClearButton.setBackground(Color.decode("#d4e3fc"));

        //for credit card 
        //Adding Label
        creditCardLabel = new JLabel("Credit Card");
        cCardIdLabel = new JLabel("Card Id:");
        cClientNameLabel = new JLabel("Client Name:");
        cIssuerBankLabel = new JLabel("Issuer Bank:");
        cBankAccountLabel = new JLabel("Bank Account:");
        cBalanceAmmountLabel = new JLabel("Balance Ammount:");
        cCVCNumberLabel= new JLabel("CVC number :");
        cInterestRateLabel = new JLabel("Interest rate :");
        cExpirationDateLabel = new JLabel("Expiration Date:");
        cGracePeriodLabel = new JLabel("Grace period:");

        //Declearing string array 
        String[] cDay = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] cMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] cYear = {"2023", "2024", "2025", "2026","2027", "2028", "2029", "2030"};

        //adding combobox
        cDayList = new JComboBox(day);
        cMonthList = new JComboBox(month);
        cYearList = new JComboBox(year);
        cDayComboBox = new JComboBox(day);
        cMonthComboBox = new JComboBox(month);
        cYearComboBox = new JComboBox(year);

        //adding text fields
        cCardIdTxt = new JTextField();
        cClientNameTxt = new JTextField();
        cIssuerBankTxt = new JTextField();
        cBankAccountTxt= new JTextField();
        cBalanceAmmountTxt= new JTextField();
        cCardIdTxt1= new JTextField();
        cCVCNumberTxt  =  new JTextField();
        cInterestRateTxt = new JTextField();
        cGracePeriodTxt= new JTextField();

        //adding buttons
        cAddCreditCardButton = new JButton("Add Credit Card ");

        //setting bounds 
        creditCardLabel.setBounds(8,380,167,32);
        cCardIdLabel.setBounds(15, 428,246,29);
        cCardIdTxt.setBounds(118,431,209,22);
        cClientNameLabel.setBounds(15, 466, 81, 22);
        cClientNameTxt.setBounds(118, 470, 209, 22);
        cIssuerBankLabel.setBounds(15, 505, 139, 22);
        cIssuerBankTxt.setBounds(118,509,209,22);
        cBankAccountLabel.setBounds(397, 422, 161, 26);
        cBankAccountTxt.setBounds(510,426, 209, 22);
        cBalanceAmmountLabel.setBounds(397, 461, 113, 22);
        cBalanceAmmountTxt.setBounds(510,461, 209, 22);
        cCVCNumberLabel.setBounds(15,544,224,27);
        cCVCNumberTxt.setBounds(118,546,209,22);
        cInterestRateLabel.setBounds(397,498,213,26);
        cInterestRateTxt.setBounds(510,496,209,22);
        cExpirationDateLabel.setBounds(397,542,213,26);
        cDayList.setBounds(493,542,55,22);
        cMonthList.setBounds(562,542,72,22);
        cYearList.setBounds(655,542,58,22);

        cAddCreditCardButton.setBounds(607,590,130,22);

        //adding action listener
        cAddCreditCardButton.addActionListener(this);

        //adding frame
        frame.add(creditCardLabel);
        frame.add(cCardIdLabel);
        frame.add(cCardIdTxt);
        frame.add(cClientNameLabel);
        frame.add(cClientNameTxt);
        frame.add(cIssuerBankLabel);
        frame.add(cIssuerBankTxt);
        frame.add(cBankAccountLabel);
        frame.add(cBankAccountTxt);
        frame.add(cBalanceAmmountLabel);
        frame.add(cBalanceAmmountTxt);
        frame.add(cGracePeriodLabel);
        frame.add(cGracePeriodTxt);
        frame.add(cCVCNumberLabel);
        frame.add(cCVCNumberTxt);
        frame.add(cInterestRateLabel);
        frame.add(cInterestRateTxt);
        frame.add(cExpirationDateLabel);
        frame.add(cDayList);
        frame.add(cMonthList);
        frame.add(cYearList);

        frame.add(cAddCreditCardButton);

        //seting font
        creditCardLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 15));

        //setting colors
        creditCardLabel.setForeground(Color.decode("#4c7a34"));
        cAddCreditCardButton.setBackground(Color.decode("#cbe8ba"));

        //for Set Credit Limit
        cSetCreditLimitLabel = new JLabel("Set Credit Limit");
        cSetCreditLimitLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 15));
        cSetCreditLimitLabel.setForeground(Color.decode("#4c7a34"));
        cCardIdLabel1 = new JLabel("Card Id:");
        cCreditLimitLabel = new JLabel("Credit limit:");

        //adding text fields
        cCreditLimitTxt= new JTextField();

        //adding buttons
        cDisplayButton = new JButton("Display");
        clearButton = new JButton("Clear");
        cSetCreditLimitButton = new JButton("Set Credit Limit");

        //adding colors 
        cDisplayButton.setBackground(Color.decode("#fff1d7"));
        clearButton.setBackground(Color.decode("#d4e3fc"));
        cSetCreditLimitButton.setBackground(Color.decode("#f7fade"));

        //setting bounds
        cSetCreditLimitLabel.setBounds(15,604,167,32);
        cCardIdLabel1.setBounds(15,632,246,29);
        cCardIdTxt1.setBounds(115,636,209,22);
        cCreditLimitLabel.setBounds(15,713,246,29);
        cCreditLimitTxt.setBounds(118,713,209,22);
        cGracePeriodLabel.setBounds(15,669,246,29);
        cGracePeriodTxt.setBounds(115,676,209,22);
        cSetCreditLimitButton.setBounds(159,750,165,22);
        cDisplayButton.setBounds(493,751,128,22);
        clearButton.setBounds(633,751,128,22);

        //adding action listener
        cSetCreditLimitButton.addActionListener(this);
        cDisplayButton.addActionListener(this);
        clearButton.addActionListener(this);

        //adding frame
        frame.add(cCardIdLabel1);
        frame.add(cCardIdTxt1);
        frame.add(cCreditLimitLabel);
        frame.add(cCreditLimitTxt);
        frame.add(cSetCreditLimitButton);
        frame.add(cDisplayButton);
        frame.add(clearButton);
        frame.add(cSetCreditLimitLabel);

        //for Cancel Credit Card
        //Adding label
        cCancelCreditCard = new JLabel("Cancel Credit Card");
        cCardIdLabel2 = new JLabel("Card Id:");

        //adding text fields
        cCardIdTxt2 = new JTextField();

        //adding font
        cCancelCreditCard.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 15));

        //adding buttons
        cCancelCreditCardButton = new JButton("Cancel credit card");

        //adding colors 
        cCancelCreditCardButton.setBackground(Color.decode("#f6a2bf"));
        cCancelCreditCard.setForeground(Color.decode("#4c7a34"));

        //setting bounds 
        cCardIdLabel2.setBounds(397,645,246,29);
        cCardIdTxt2.setBounds(456,645,209,22);
        cCancelCreditCard.setBounds(393,604,167,32);
        cCancelCreditCardButton.setBounds(591,699,142,22);

        //adding action listener
        cCancelCreditCardButton.addActionListener(this);

        //adding frame
        frame.add(cCardIdLabel2);
        frame.add(cCardIdTxt2);
        frame.add(cCancelCreditCard);
        frame.add(cCancelCreditCardButton);

        //setting frame
        frame.setSize(800, 900);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }  

    public void actionPerformed(ActionEvent e){
        //to clear text field 
        //if clear button is pressed the text field gets empty 
        if (e.getSource() == dClearButton)
        { 
            dCardIdTxt.setText("");
            dClientNameTxt.setText("");
            dIssuerBankTxt.setText("");
            dBankAccountTxt.setText("");
            dBalanceAmmountTxt.setText("");
            dPinNumberTxt.setText("");
            dCardIdTxt1.setText("");
            dWithdrawalAmountTxt.setText("");
            dPinNumberTxt1.setText("");

        }

        //to add DebitCardButton
        if (e.getSource()== addDebitCardButton)

        { 
            try {
                int cardId = Integer.parseInt(dCardIdTxt.getText());
                String clientName = dClientNameTxt.getText();
                String issuerBank = dIssuerBankTxt.getText();
                String bankAccount = dBankAccountTxt.getText();
                int balanceAmount = Integer.parseInt(dBalanceAmmountTxt.getText());
                int pinNumber =  Integer.parseInt(dPinNumberTxt.getText());
                boolean same = false;
                //loop through the arrayBankcard list for each element and check if it is an instance of DebitCard  
    
                for(BankCard objDebit: arrayBankCard){
                    if (objDebit instanceof DebitCard){
                        DebitCard debitCard1 = (DebitCard) objDebit;
                        if (cardId == debitCard1.getcardId()){
                            same = true;
                        }
                    }
                }

                DebitCard objDebit = new DebitCard(cardId,clientName,issuerBank,bankAccount,balanceAmount,pinNumber);
                if (same == false ){
                    arrayBankCard.add(objDebit);
                    JOptionPane.showMessageDialog(frame, "Thank you for providing these details", "Input received", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(frame, "Data is repeated ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Text field empty or The data entered is not valid ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        
        //to display information
        if (e.getSource() == dDisplayButton){
            // if text field is empty 
            if(
            dCardIdTxt1.getText().isEmpty() || dWithdrawalAmountTxt.getText().isEmpty() || dPinNumberTxt1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill all the text field", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                //loop through the arrayBankCard list and for each element check if it is an instance of DebitCard

                boolean exist = true;
                for ( BankCard newcard: arrayBankCard) {

                    if (newcard instanceof DebitCard){

                        DebitCard newobject=(DebitCard) newcard;
                        if (newobject.getcardId() == Integer.parseInt(dCardIdTxt1.getText()))
                        {
                            ((DebitCard)newobject).display();
                            JOptionPane.showMessageDialog(null, "Card ID is " + newobject.getcardId() + "\n" + 
                                "Client Name: " + newobject.getclientName() + "\n" +
                                "Issuer Bank: " + newobject.getissuerBank() + "\n" +
                                "Bank Account: " + newobject.getbankAccount() + "\n" +
                                "Balance Amount: " + newobject.getbalanceAmount() + "\n" +
                                "Pin number: " + newobject.getpinNumber() + "\n" + "****" + "\n" +
                                "Withdrawal Amount: " + newobject.getwithdrawalAmount() + "\n" +
                                "Date of Withdrawal: " + newobject.getdateOfWithdrawal()," Debit card information ", JOptionPane.INFORMATION_MESSAGE);
                            exist = true;
                            break;
                        } else{
                            exist = false;
                        }
                    }
                }
                if (exist == false)
                {
                    JOptionPane.showMessageDialog(null, "Debit Card doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //to withdraw
        if (e.getSource() == dWithdrawButton) {
            try 
            {

                String dDay =(String) dayComboBox.getSelectedItem();
                String dMonth  = (String)monthComboBox.getSelectedItem();
                String dYear = (String)yearComboBox.getSelectedItem();
                String dDate = dDay + "/" + dMonth + "/" + dYear;
                int CardId1 = Integer.parseInt(dCardIdTxt1.getText());
                int PinNumber1 = Integer.parseInt(dPinNumberTxt1.getText());
                int WithdrawalAmount1 = Integer.parseInt(dWithdrawalAmountTxt.getText());
                boolean exist = true;
                //LOOP  through the arrayBankCard list and for each element check if it is an instance of DebitCard 
                for (BankCard bankCard: arrayBankCard){
                    if (bankCard instanceof DebitCard){
                        
                        DebitCard newobject=(DebitCard) bankCard;
                        if (newobject.getcardId() == CardId1 && newobject.getpinNumber() == PinNumber1)
                        {
                            newobject.withdraw(WithdrawalAmount1,dDate,PinNumber1);
                            JOptionPane.showMessageDialog(frame, "Withdrawal successful:\nCard ID: " + CardId1  + "\nWithdrawal Amount: " + WithdrawalAmount1 + "\nDate of Withdrawal: " + dDate);
                            exist = true;
                            break;
                        } else{
                            exist = false;
                        }
                       
                    }

                }
                if (exist == false)
                {
                    JOptionPane.showMessageDialog(null, "Withdraw Failed", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

            catch (NumberFormatException ex) 
            {
                JOptionPane.showMessageDialog(frame, "Invalid input format", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // to display information of credit card 
        if (e.getSource() == cDisplayButton){
            if(cCardIdTxt.getText().isEmpty() || cClientNameTxt.getText().isEmpty() || cIssuerBankTxt.getText().isEmpty() || cBankAccountTxt.getText().isEmpty() ||
            cBalanceAmmountTxt.getText().isEmpty() ||cCVCNumberTxt.getText().isEmpty() || cCardIdTxt1.getText().isEmpty() || cGracePeriodTxt.getText().isEmpty() || cCreditLimitTxt.getText().isEmpty()) 
            {
                JOptionPane.showMessageDialog(frame, "Please fill all the text field", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                boolean exist = true;
                //LOOP through the arrayBankCard list and for each element 
                for ( BankCard newcard: arrayBankCard) {
                    if (newcard instanceof CreditCard){

                        CreditCard newobject=(CreditCard) newcard;
                        if (newobject.getcardId() == Integer.parseInt(cCardIdTxt1.getText()))
                        {
                        newobject.display();
                        JOptionPane.showMessageDialog(null, "Card ID is " + newobject.getcardId() + "\n" +  
                            "Client Name: " + newobject.getclientName() + "\n" +
                            "Issuer Bank: " + newobject.getissuerBank() + "\n" +
                            "Bank Account: " + newobject.getbankAccount() + "\n" +
                            "Balance Amount: " + newobject.getbalanceAmount() + "\n" + "****" + "\n" +
                            "Interest Rate " + newobject.getinterestRate() + "\n" +  
                            "CVC Number: " + newobject.getcvcNumber() + "\n" +
                            "Grace period: "+ newobject.getgracePeriod() + "\n" +
                            "Credit Limit: "+ newobject.getcreditLimit() + "\n" +
                            "Expiration Date: " + newobject.getexpirationDate()," Credit card information ", JOptionPane.INFORMATION_MESSAGE);
                        exist = true;
                        break;

                    } else{
                        exist = false;
                    }
                }
                }
                if (exist == false)
                {
                    JOptionPane.showMessageDialog(null, "Credit Card doesn't exist");
                }
            }
        }
        //to cancel credit card 
        if(e.getSource() == cCancelCreditCardButton){
            try{

                int cardId = Integer.parseInt(cCardIdTxt2.getText());
                boolean exists = true;
                //LOOP  through the arrayBankCard array to find the credit card with the specified cardId 
                for (BankCard bankCard: arrayBankCard){
                    if (bankCard instanceof CreditCard){

                        CreditCard creditObject = (CreditCard) bankCard;

                        if (creditObject.getcardId() == cardId){

                            creditObject.cancelCreditCard();

                            JOptionPane.showMessageDialog(null, "Credit card with ID " + cardId + " has been cancelled.");

                            exists = true;
                            break;  
                        }
                        else{

                            exists = false;

                        }
                    }

                }
                if(exists == false){
                    JOptionPane.showMessageDialog(null, "Credit card with ID " + cardId + " does not exist.");

                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid card ID.");
                // clear text field
                cCardIdTxt.setText("");
            }
        }
        // to set credit limit 
        if (e.getSource() == cSetCreditLimitButton) {
            try 
            {

                int CardId2 = Integer.parseInt(cCardIdTxt1.getText());
                int GracePeriod = Integer.parseInt(cGracePeriodTxt.getText());
                Double CreditLimit = Double.parseDouble(cCreditLimitTxt.getText());
                //LOOP  through the arrayBankCard array to find the credit card with the specified cardId. 
                for (BankCard bankCard: arrayBankCard){
                    if (bankCard instanceof CreditCard){ 
                        CreditCard creditObject = (CreditCard) bankCard;
                        if (creditObject.getcardId() == CardId2 ) {
                            creditObject.setcreditLimit(CreditLimit,GracePeriod);
                            JOptionPane.showMessageDialog(frame,"Credit limit set ","Successful",JOptionPane.INFORMATION_MESSAGE );
                        } else {
                            JOptionPane.showMessageDialog(frame, "Setting Credit Limit failed", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input format", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        // to clear 
        if (e.getSource()==clearButton){
            cCardIdTxt.setText("");
            cClientNameTxt.setText("");
            cIssuerBankTxt.setText("");
            cBankAccountTxt.setText("");
            cBalanceAmmountTxt.setText("");
            cInterestRateTxt.setText("");
            cCVCNumberTxt.setText("");
            cCardIdTxt1.setText("");
            cGracePeriodTxt.setText("");
            cInterestRateTxt.setText("");
            cCreditLimitTxt.setText("");
            cCardIdTxt2.setText("");

        }
        // to add credit card 
        if (e.getSource()==cAddCreditCardButton){

            if(cCardIdTxt.getText().isEmpty() || cClientNameTxt.getText().isEmpty() || cIssuerBankTxt.getText().isEmpty() || cBankAccountTxt.getText().isEmpty() ||
            cBalanceAmmountTxt.getText().isEmpty() ||cCVCNumberTxt.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(frame, "Please fill all the text field", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                try {
                    if (Integer.parseInt(cCardIdTxt.getText()) < 0 || 
                    Integer.parseInt(cInterestRateTxt.getText()) < 0 ||  
                    Integer.parseInt(cBalanceAmmountTxt.getText()) < 0) 
                    {
                        JOptionPane.showMessageDialog(frame, "Incorrect entry of data ", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        int cCardId = Integer.parseInt(cCardIdTxt.getText());
                        String cClientName = cClientNameTxt.getText();
                        String cIssuerBank = cIssuerBankTxt.getText();
                        String cBankAccount = cBankAccountTxt.getText();
                        int cBalanceAmmount = Integer.parseInt(cBalanceAmmountTxt.getText());
                        int cCVCNumber =  Integer.parseInt(cCVCNumberTxt.getText());
                        Double cInterestRate = Double.parseDouble(cInterestRateTxt.getText());
                        String cDay = cDayComboBox.getSelectedItem().toString();
                        String cMonth  = cMonthComboBox.getSelectedItem().toString();
                        String cYear = cYearComboBox.getSelectedItem().toString();

                        String cDate = cDay + "/" + cMonth + "/" + cYear;

                        CreditCard objCredit = new CreditCard(cCardId,cClientName,cIssuerBank,cBankAccount,cBalanceAmmount,cCVCNumber,cInterestRate,cDate);
                        arrayBankCard.add(objCredit);
                        JOptionPane.showMessageDialog(frame, "Thank you for providing these details", "Input received", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "The data entered is not valid ", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        }
    }

    public static void main (String[]args){
         BankGUI obj = new BankGUI();

    }

}

