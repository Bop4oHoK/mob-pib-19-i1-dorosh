public class Account {
     int number;
     char status;
     double money;
    public Account(int number, char status, double money) {
         this.number = number;
         this.status = status;
         this.money = money;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
