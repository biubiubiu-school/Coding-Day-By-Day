package minminaya.solution20190531

class ExactMethod {

    /**
     *
     * 异或操作，2个数一样数比较相邻的直接过滤掉了
     * @param array 输入的数组
     * */
    fun exactNum1(array: IntArray) {
        println("--------方法1----------")
        var result = 0
        array.forEach { result = result xor it }.run { println("结果为：$result") }
        println("---------------------------")
        println("")
    }

    /**
     * 1、s数组先进行从小到大的排序
     * 2、数组遍历一遍，对当前的array[index]和array[index + 1]进行比较，如果相等，那么说明他们是成对出现的，那么进行下一组比较
     * 3、当取到不相等的组时，当前的array[index]就是只出现一次的数
     *
     * @param array 输入的数组
     * */
    fun exactNum2(array: IntArray) {
        println("--------方法2----------")
        array.sort()
        for (index in 0 until array.size - 1 step 2)
            if (array[index] != array[index + 1]) {
                println("结果为：${array[index]}")
            }
    }

    companion object {

        private var input = intArrayOf(2, 2, 1)

        @JvmStatic
        fun main(args: Array<String>) {
            val method = ExactMethod()
            method.exactNum1(input)
            method.exactNum2(input)
        }
    }
}