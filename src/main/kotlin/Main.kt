fun main(){
   var one = "Hamisi"

    println(one.random())
    multiples()

    var account1 = CurrentAccount("1689923467", "Tom Cruise", 45000.00)
    account1.deposit(6000.05)
    account1.withdraw(500.00)
    account1.details()

    var savings1 = SavingsAccount("165432345", "Thomas Shelby", 449000.55, 3)
    savings1.withdraw(450.00)
    println(savings1.withdrawals)


    var savings2 = SavingsAccount("164454125", "Steph Curry", 449000.55, 7)
    savings2.withdraw(450.00)
    savings2.details()
//    savings2
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
data class randomString(var stringed: String)
fun random(str:String):String{
    var firstChar = str[0]
    var lastChar = str[-1]
    var length = str.length
    var all = ("Firstchar is $firstChar, last Char = $lastChar,  length is $length")
    return all
}


//Question2
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun validatePassword(password:String){
    while (password!=="password"){
     //if (password.length in 8..16 && password.contains(0..9) ){
        }
    }


//Question 3
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(){
    var numbers = 1..1000
    for (number in numbers){
        if (number%6 ==0 &&number%8 ==0){
            println("Bingo")
        }
        else if (number%6==0){
            println("multiple of 6 = $number")
        }
        else if ((number%8 ==0)){
             println("Multiple of 8 = $number")
        }

    }

}
//  Question4
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var accountNumber:String, var accountname:String, var balance:Double){
    fun deposit(amount: Double){
        balance += amount
    }
  open fun withdraw(amount: Double){
        balance -=amount
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountname")
    }
}

//question 6
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(accountNumber: String, accountname: String, balance: Double, var withdrawals:Int):CurrentAccount(accountNumber,
    accountname, balance,  ){
    override fun withdraw(amount: Double) {
        if (withdrawals<4){
            println("You Can Withdraw")
            withdrawals++
        }
        else{
            println("You Cannot withdraw")
        }
    }
}