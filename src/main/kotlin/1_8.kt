import java.util.Arrays;
var arr = {size:Int->Array<Int>(size){index->index}}


fun sort_array(a:IntArray):IntArray
{
    for (i in 0..(a.size)-1)
    {
        for (j in 0..(a.size)-1)
        {
            if (a[i]<a[j])
            {
                var temp = a[i]
                a[i]=a[j]
                a[j]=temp
            }
        }
    }
    return a
}


fun main(){
    println("Create Array-1 by using arryof() method : ")
    var array = arrayOf(1,2,3,4,5,6,7)
    println(Arrays.deepToString(array))
    println("Create Array-2 by using Array<>() method : ")
    var array2 = Array<Int>(size = 7){0}
    println(array2.contentDeepToString())
    println("Create Array-3 by using Array<>() and lambda function : ")
    var array3 = arr(5)
    println(array3.contentDeepToString())
    println("Create Array-4 by using IntArray() : ")
    var array4 = IntArray(size=5){0}
    println(array4.joinToString())
    println("Create Array-5 by using intArrayof() :")
    var array5 = intArrayOf(1,2,3,4,5,6,7)
    println(array5.joinToString())
    println("Create Array-6 by using arrayof() And intArrayof() :")
    var array6 = arrayOf(intArrayOf(1,2), intArrayOf(4,5))
    println(array6.contentDeepToString())

    println("Enter size of array :")
    var len = readln().toInt();
    var arr = IntArray(size = len){0}
    for (i in 0..len-1)
    {
        print("array[$i] : ")
        arr[i] = readln().toInt();
    }
    var ans = sort_array(arr)
    println(ans.joinToString())
    var ans_in = arr.sorted()
    println(ans_in.joinToString())
}