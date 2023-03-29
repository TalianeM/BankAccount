package org.example;

public class BankAccount {


//    Creating bank account class

    private String firstName;

    private String lastName;

    private String dateOfbirth;

    private int accountNumber;

    private double balance;

    public BankAccount(String inputFirstName, String inputLastname, String inputDateofBirth, int inputAccountNumber, double inputBalance){
        this.firstName = inputFirstName;
        this.lastName = inputLastname;
        this.dateOfbirth = inputDateofBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;
        
//       Getters and setters for properties

        public String getfirstName(){
            return this.firstName;
        }
        public void setFirstname(String newfirstname){
            this.firstName = newfirstname;
        }
        public String getlastname(){
            return this.lastName;
        }

        public void setLastname(String newLastname){
            return this.lastName = newLastname;
        }

        public String getdateofBirth(){
            return this.dateOfbirth;
        }

        public void setdateofBirth(String newdateofBirth){
            return this.setdateofbirth = newdateofBirth;
        }

        public String getaccountNumber(){
            return this.accountNumber;
        }

        public void setaccountNumber(String newaccountNumber){
           return this.setaccountNumber = newaccountNumber;
        }


        public String getbalance(){
            return this.balance;
        }

        public void setbalance(String newsetbalance){
           return this.setbalance = newsetbalance;
        }


//        Creating method


        public void deposit(){

        }

        public void withdrawl(){

        }

        public void interestPay(){
        }











    }












