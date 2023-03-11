fun main () {
    var calculator = Calculator(50,50,50,50)
    calculator.multiplication(50,10)
    println(calculator.mult)
    calculator.division(50,10)
    calculator.addition(50,10)
    calculator.subtraction(50,10)
    //the human class
    var human = Human("Alice",23,59.0)
    human.eat(3)
    println(human.weight)
    human.speak("I love coding")
    human.age
    println(human.age)
    human.birthday()
    //The data class
    var user = User("Alice","Moraa","alicemoraa@gmail.com","0759547300")
    println(user.email)
    println(user.phoneNumber)
    println(user.firstName)
    println(user.lastName)

}
class Calculator(var add:Int,var sub:Int,var mult:Int,var div:Int){
    fun addition(num1:Int,num2:Int){
        println(num1+num2)
    }
    fun subtraction(num1:Int,num2:Int){
        println(num1-num2)
    }
    fun division(num1:Int,num2:Int){
        println(num1/num2)
    }
    fun multiplication(num1:Int,num2:Int){
        println(num1*num2)
    }
}
class Human (var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
        println(age)
    }

}
data class User (var firstName:String,var lastName:String,var email:String,var phoneNumber:String){

}
