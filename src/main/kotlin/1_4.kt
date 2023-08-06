fun main()
{
    print("Enter the Number:")
    var n= readLine()!!.toInt()
    if(n%2==0)
        println("$n is even")
    else
        println("$n is odd")
}
