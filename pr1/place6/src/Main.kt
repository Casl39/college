//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите первую число:")
    val yStr = readln().toIntOrNull()
    println("Введите вторую число:")
    val xStr = readln().toIntOrNull()
    if (yStr == null || xStr == null)
    {
        println("Введите число")
        return
    }
    val x = xStr!!
    val y = yStr!!
    val num1 = x * 10 + y
    val num2 = y * 10 + x
    if (num1 % 2 != 0) println("Нечётные число: $num1")
    else if (num2 % 2 != 0) println("Нечётные число: $num2")
    else println("Создать нечетное число невозможно")
}