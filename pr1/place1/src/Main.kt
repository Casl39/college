//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var sum = 0
    val string = "AAADSSSRRTTHAAAA"
    var answer = ""
    var i = 1
    while (i < string.length)
    {
        if (string[i] == string[i - 1])
        {
            sum += 1
            i +=1
        }
        //else {
        // sum += 1
        // i += 1
        //}
        else
        {
            print(sum)
            answer += string[i - 1]
            answer += sum + 1
            sum = 0
            i +=1
        }
    }
    answer += string[i - 1]
    answer += sum + 1
    print("Ответ:$answer")
}