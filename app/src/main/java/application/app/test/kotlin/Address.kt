package application.app.test.kotlin

/**
 * Created by lwz on 2018/1/17.
 * ��������(Declaring Properties)
 */
class Address {
    /**
     * Kotlin�п���ʹ��var�ؼ��������ɱ����ԣ�
     * ������val�ؼ�������ֻ�����ԣ����Ե������ں��棬
     * ��������ǩ�����м��ð�źͿո�
     */
    public var name: String = "22"
    public var street: String = "11"
    public var city: String = "23"
    public var state: String = "43"
    public var zip: String = "53"

    //���õ�ʱ����Javaһ����ͨ��������ֱ��ʹ��һ������

    fun copyAddress(address: Address): Address {
        val result = Address()
        result.city = city
        result.state = state

        return result

    }


}
