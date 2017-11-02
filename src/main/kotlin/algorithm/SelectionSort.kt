package algorithm

class SelectionSort {

    fun doSort(array: Array<Int>): Array<Int> {
        for (i in 0 until array.size - 1) {
            var index = i
            for (j in i + 1 until array.size)
                if (array[j] < array[index])
                    index = j

            val smallerNumber = array[index]
            array[index] = array[i]
            array[i] = smallerNumber
        }
        return array
    }

}