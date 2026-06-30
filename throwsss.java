public class throwsss {
    double balance; 

 public throwsss(double initialBalance) { 

        this.balance = initialBalance; 

    } 

   public void withdraw(double amount) { 

        if (amount <= 0) { 

            throw new IllegalArgumentException( 

                "Withdrawal amount must be positive. Got: " + amount); 

} 

        if (amount > balance) { 

            throw new ArithmeticException( 

                "Insufficient funds! Balance: " + balance + 

                ", Requested: " + amount); 

        } 

        balance -= amount; 

        System.out.println("Withdrawal successful. Balance: " + balance); 

    } 

  

    public static void main(String[] args) { 

        throwsss account = new throwsss(1000.0); 

        try { 

            account.withdraw(500);   

            account.withdraw(2000);   
            account.withdraw(-100);

        } catch (ArithmeticException e) { 

            System.out.println("Transaction failed: " + e.getMessage()); 

        } 
        catch(IllegalArgumentException e){
            System.out.println("transaction failed:"+e.getMessage());
        }

    } 

} 

