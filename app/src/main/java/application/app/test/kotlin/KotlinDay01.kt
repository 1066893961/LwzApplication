package application.app.test.kotlin

/**
 * Created by lwz on 2018/1/17.
 *   作者：叫我旺仔
 *   链接：https://www.jianshu.com/p/54aa3ed91f04
 *   來源：简书
 *   著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 *
 *
 *   Kotlin是针对JVM、Android 和浏览器的静态编程语言！
 *   100% 与 Java™ 可互操作！
 */
class KotlinDay01 {

    /**
     * 定义函数
     * java:
     *  private int getResult(int a, int b) {
     *  return a + b;
     *  }
     */

    //如果一个函数只有一个并且是表达式函数体并且是返回类型自动推断的话，可以直接这样写
    fun getResule(a: Int, b: Int) = a + b;// 这里的函数没有写返回值，以为Kotlin会自动判断返回值类型

    //加if表达式  1111111
    fun max1(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    //加if表达式  2222222
    fun max2(a: Int, b: Int) = if (a > b) b else a

    /**
     * 如果函数返回一个无意义的值，相当于Java的void，则可以这样写
     */
    fun getResule2(a: Int, b: Int): Unit {
        print(a + b)
    }

    //Uint 的返回类型可以省略
    fun getResult3(a: Int, b: Int) {
        print(a + b)
    }


    /**
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * 定义局部变量
     * Kotlin声明变量与Java声明变量有些不一样，Java变量类型在前，变量名在后，
     * 而Kotlin则相反，变量名在前，变量类型在后，中间加:(冒号)，并且Kotlin可以自动判断变量的类型
     */
    fun initVal() {
        //声明局部常量（常量使用val关键字）
        val a: Int = 11
        val b = 11  //自动判断出Int类型
        val c: Int  // 当没有初始化值的时候要声明类型，全局变量不能这样写
        c = 22 //赋值


        //声明变量（变量使用var关键字）
        var xs = 2  //自动判断出Int类型
        xs += 1
    }


    /**
     * 使用${变量}，如变量为args: Array<String>"，使用的时候可以这样写
     */
    fun main(args: Array<String>) {
        if (args.size == 0) return
        print("first argument ${args[0]}")
    }

    //而不用再去用加号加起来，gradle里面也是支持的
    fun main1(args: Array<String>) {
        if (args.size == 0) return
        print("First argument: " + args[0])
    }

    //当一个变量、函数可能出现空值的时候，应该指出该引用可空，如
    fun getResult22(a: Int, b: Int): Int? { // 设置函数返回类型可空
        print(a + b)
        return null
    }


    /**
     * 使用类型检查和自动转换
     * is运算符是检查一个表达式是否是某个类型的实例，如果为不可变局部变量或属性进行类型检查，则无需显式转换
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj`在这个分支中自动转换为`String`类型
            return obj.length
        }
        // `obj`仍然是`Any`类型
        return null
    }

    //2222
    fun getStringLength2(obj: Any): Int? {
        if (obj !is String) return null

        // `obj`在这个分支中自动转换为`String`类型
        return obj.length
    }

    //333
    fun getStringLength3(obj: Any): Int? {
        // `obj` 自动转换成`String`类型，并且在&&后面生效
        if (obj is String && obj.length > 0) {
            return obj.length
        }

        return null
    }

    /**
     * 使用for循环(Using a for loop)
     *  与Java相比，Kotlin使用for循环要更加的简洁
     */

    fun main2(args: Array<String>) {
        for (age in args) { // in操作符可以判断是否arg是否在args里面
            print(age)
        }
    }

    //或者这样写  如：
    fun main3(args: Array<String>) {
        for (i in args.indices) {
            print(args[i])
        }
    }

    /*
    使用while循环
     */
    fun main4(args: Array<String>) {
        var i = 0
        while (i < args.size) {
            print(args[i++])
        }
    }

    /**
     *  使用when表达式(Using when expression)
     *  when表达式就相当于Java的switch表达式，省去了case和break，并且支持各种类型。
     */
    fun case(obj: Any) {
        when (obj) {
            1               -> print("one")//如果obj的值为1
            obj is String   -> print("sdd")
            "sdsd"          -> print("sds")
            !is String      -> print("sd")
            else            -> print("unKnown")

        }

    }


}