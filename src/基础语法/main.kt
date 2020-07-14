package 基础语法
  /*
   * 一、输出语句
   * */
fun test1(){
    print("Hello World")//输出语句
    print("\n")
    println("My name is CC")//换行输出语句
}

/*
 * 二、定义变量
 * */
fun test2(){
    var a = 1//定义一个整型变量
    var b = 3.14//定义一个浮点型变量
    val name = "Moriarty"//定义一个字符串常量
    b = a.toDouble()//把a的值转化为double型赋给b
}

/*
   * 三、条件输出语句
   * */
//（1）if-else语句
fun test3(){
    var score = 60
    var result = if (score>=60) "合格" else "不合格"
    //if-else语句的最后内容就是这个表达式的返回值
    println(result)
    //（2）when语句，类似于switch语句
    var num = 60
    when(num){
        60-> println("合格")
        80-> println("良好")
        100-> println("优秀")
    }
    //与switch语句不同的是，when语句和in语句搭配可以指定范围
    when(num){
        in 60..70 -> println("合格")
        in 71..90-> println("良好")
        in 91..100-> println("优秀")
    }
    var result1 = when(num){
        in 60..70 -> "合格"
        in 71..90->  "良好"
        in 91..100-> "优秀"
        else -> "不合格"
    }
}

  /*
   * 四、循环语句
   * */
fun test4(){
    for (i in 1..10){
        print(i)
    }//从1输出到10
    for (i in 10 downTo 1){
        print(i)
    }//从10输出到1
      var names = arrayOf("Tom","Jack","Merry")
      for (i in names.indices){
          print(names[i])
      }//遍历数组
}
fun main(){
    test4()
}