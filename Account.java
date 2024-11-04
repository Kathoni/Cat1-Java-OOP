public class Account {
    String id;
    String name;
    int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }
    }

    public void transferTo(Account otherAccount, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            otherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance.");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
