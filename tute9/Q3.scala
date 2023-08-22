class Account(n:Int, b:Double) {
    val acnumber:Int = n
    var balance:Double = b

    def withdraw(a:Double) = this.balance = this.balance - a
    def deposit(a:Double) = this.balance = this.balance + a
    def transfer(a:Account, b:Double) = {
        if (this.balance < b) println("Insufficient balance")
        else 
            {
                this.withdraw(b)
                a.deposit(b)
            }
    }

    override def toString = "Account "+acnumber+" : " + balance
}

object Q3_9{
    var a1 = new Account(1, 1000)
    var a2 = new Account(2, 2000)
  
    println(a1)
    println(a2)

    a1.deposit(500)
    a2.withdraw(200)

    println(a1)
    println(a2)

    a1.transfer(a2, 1000)
    println(a1)
    println(a2)

    a1.transfer(a2, 2000)
    println(a1)
    println(a2)
}