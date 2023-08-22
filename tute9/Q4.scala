class Account(n:Int, b:Double) {
    val acnumber:Int = n
    var balance:Double = b

    def withdraw(a:Double) = this.balance = this.balance - a
    def deposit(a:Double) = this.balance = this.balance + a
    def transfer(a:Account, b:Double) = {
        if (this.balance < b) println("Insufficient balance")
        else{
            this.withdraw(b)
            a.deposit(b)
        }
    }

    override def toString = "Account "+acnumber+" : " + balance
}

object Q4_9 extends App{
    val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)
    val balance=(b:List[Account]) => b.map(_.balance).sum
    val interest = (b:List[Account]) => b.map(x => if (x.balance > 0) x.balance = x.balance + x.balance * 0.05 else x.balance = x.balance + x.balance * 0.1)

    var a1 = new Account(1, 1000)
    var a2 = new Account(2, 2000)
    var a3 = new Account(3, -500)
    var a4 = new Account(4, -1000)
    var a5 = new Account(5, 5000)
    var a6 = new Account(6, -2000)
    var a7 = new Account(7, 10000)
    var a8 = new Account(8, -5000)
    var a9 = new Account(9, 2000)
    var a10 = new Account(10, 1000)

    var bank:List[Account] = List(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)

    println("List of Accounts")
    println(bank)

    println("\nList of Accounts with negative balances")
    println(overdraft(bank))

    println("\nTotal Balance "+balance(bank))
    
    println("\nFinal balances of all accounts after applying the interest")
    interest(bank)
    println(bank)
}