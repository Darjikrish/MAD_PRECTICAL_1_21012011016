fun fact(a:Int):Int
{
    if (a>=1)
    {
        return (a)*fact(a-1);
    }
    else
    {
        return 1;
    }

}
fun facto2(a:Int,b:Int=1):Int
{
    var c = a*b;
    return if (a<=1)
    {
        c;
    }
    else
    {
        facto2(a-1,c)
    }
}
fun main()
{
    println("Enter Number : ");
    var a = readln().toInt();
    println("Factorial of ${a} = ${fact(a)}");
    println("BY tailrec Keyword,Factorial of $a = ${facto2(a)}")
}