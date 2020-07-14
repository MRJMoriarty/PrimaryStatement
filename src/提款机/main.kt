package 提款机

import java.util.*

/*
* 1.取款界面
* 2.输入密码
* 3.密码正确取钱
* 4.密码错误重新输入
* 5.错误三次冻结账户
* */
val password = 123456
fun UI(){
    println("欢迎使用**银行")
    print("请输入密码")
}
fun CheckPassword(){
    var count :Int
    for (i in 1..3){
        count = 3-i
        var num:Int = Integer.valueOf(readLine())
        if (num == password) {
            println("密码正确，请操作")
            break
        }
        else {
            if (i<3) {
                println("密码错误，请重新输入")
             println("您还有 $count 次机会")
            }
            else{
                println("密码错误3次，您的卡已被冻结，请去柜台解冻")
            }
        }
    }

}
fun main() {
    UI()
    CheckPassword()
}
