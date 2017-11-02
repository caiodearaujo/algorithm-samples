package algorithm

class InsertionSort {

    fun doSort(array: Array<Int>): Array<Int> {
        var temp: Int
        for (i in 1 until array.size) {
            for (j in i downTo 1) {
                if (array[j] < array[j - 1]) {
                    temp = array[j]
                    array[j] = array[j - 1]
                    array[j - 1] = temp
                }
            }
        }
        return array
    }

}