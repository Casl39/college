//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите две цифры и знак того что хотите с ними сделать. / — деление, * — умножение, + — сложение, - — вычитание")
    val user = readln()
    val part = user.split(" ")
    if (part.size != 3)
    {
        println("Введи три элемента")
        return
    }
    if (part[1] == "0" && part[2] == "/")
    {
        println("На 0 делить нельзя")
        return
    }
    val (aStr, bStr, sing) = part
    val a = aStr.toFloat()
    val b = bStr.toFloat()
    var answer = 0f
    when (sing)
    {
        "/" -> answer = a / b
        "*" -> answer = a * b
        "+" -> answer = a + b
        "-" -> answer = a - b
    }
    println("Ответ = $answer")
}