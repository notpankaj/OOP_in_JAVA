package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // getters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "JIO ";
        account1.setPassword("jio@gmail.com ");
        System.out.println(account1.getPassword());
    }
}
