package application.app.test.kotlin

/**
 * Created by lwz on 2018/1/17.
 * 声明属性(Declaring Properties)
 */
class Address {
    /**
     * Kotlin中可以使用var关键字声明可变属性，
     * 或者用val关键字声明只读属性，属性的类型在后面，
     * 变量名在签名，中间加冒号和空格。
     */
    public var name: String = "22"
    public var street: String = "11"
    public var city: String = "23"
    public var state: String = "43"
    public var zip: String = "53"

    //调用的时候与Java一样，通过变量名直接使用一个属性

    fun copyAddress(address: Address): Address {
        val result = Address()
        result.city = city
        result.state = state

        return result

    }


}

