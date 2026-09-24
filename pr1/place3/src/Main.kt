//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Какое число хотите перевести из 10-ичной системы в двоичную?")
    val input = readln().toIntOrNull()
    if (input == null)
    {
        println("Введите число")
        return
    }
    var sum = input!!
    var answer = ""
    while (sum != 0)
    {
        answer += sum % 2
        sum = sum / 2
        println(sum)
    }
    println(answer.reversed())
}