//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите число n:")
    val nStr = readln().toIntOrNull()
    print("Введите основание степени x:")
    val xStr = readln().toIntOrNull()
    if (nStr == null || xStr == null)
    {
        println("Введите число")
        return
    }
    val x = xStr!!
    val n = nStr!!
    var y = 0
    var z = 1
    var i = 1
    while (z <= n)
    {
        if (z == n)
        {
            y = i
            break
        }
        z *= x
        i += 1
    }
    if (y != 0) println("Показатель существует, y = $y")
    else println("Показатель не существует")
}