public class Account {
    String id;
    String name;
    int balance;

    public Account( String id, String name, int  balance) {
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
    public void setId( String newId){
        this.id= newId ;
    }

    public void setName( String newName){
        this.name= newName ;
    }

    public void setBalance( int newBalance){
        this.balance= newBalance ;
    }
   


    @Override
    public String toString() {
        return "Account{" +
                "id is:" + id + "\n" +
                " name is :'" + name + "\n" +
                " balance :" + balance ;
    }
    
}
