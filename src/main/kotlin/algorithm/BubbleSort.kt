package algorithm

class BubbleSort {

    fun doSort(array: Array<Int>): Array<Int> {
        val arraySize = array.size
        var aux: Int
        for (m in arraySize downTo 0) {
            for (i in 0 until arraySize - 1) {
                aux = i + 1
                if (array[i] > array[aux]) {
                    swapNumbers(i, aux, array)
                }
            }
        }
        return array
    }

    private fun swapNumbers(i: Int, j: Int, array: Array<Int>) {
        val temp: Int = array[i]
        array[i] = array[j]
        array[j] = temp
    }

}