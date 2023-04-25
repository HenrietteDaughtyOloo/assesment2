fun main(){
//    random("Hamisi")
    println("nai")
    multiples()
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
//data class randomString(var str: String)
//fun random(str:String):randomString{
//    var firstChar = str[0]
//    var lastChar = str[-1]
//    var length = str.length
//    return randomString("Hamisi")
//}


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
//        if (password.length in 8..16 && password. ){
//
//        }
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

class CurrentAccount(var accountNumber:String, var accountname:String, var balance:Double)