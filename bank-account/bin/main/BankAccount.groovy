class BankAccount {

    def opened = false
    def balance = 0

    // You cannot do any operations before you open the account.
    // An account opens with a balance of 0
    // You can reopen an account
    synchronized open() {
        opened = true
    }

    // you cannot do any operations after you close the account
    synchronized close() {
        opened = false
    }

    // this should increment the balance
    // you cannot deposit into a closed account
    // you cannot deposit a negative amount
    synchronized deposit(int amount) {
        if (amount < 0) {
            throw new Exception('Cannot deposit negative amount')
        }
        if (!opened) {
            throw new Exception('Cannot deposit into closed account')
        }
        balance += amount
    }

    // this should decrement the balance
    // you cannot withdraw into a closed account
    // you cannot withdraw a negative amount
    synchronized withdraw(int amount) {
        if (amount > balance){
            throw new Exception('Cannot withdraw more than the balance of the account')
        }
        if (amount < 0) {
            throw new Exception('Cannot deposit negative amount')
        }
        if (!opened) {
            throw new Exception('Cannot withdraw from closed account')
        }
        balance -= amount
    }

    // returns the current balance
    synchronized getBalance() {
        if (!opened) {
            throw new Exception('Cannot read balance of closed account')
        }
        return balance
    }

}