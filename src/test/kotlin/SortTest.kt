import algorithm.*
import org.junit.Assert
import org.junit.Test

class SortTest {

    @Test
    fun bubbleSortTest() {
        var array: Array<Int> = BubbleSort().doSort(arrayOf(5,2,4,1,3))
        Assert.assertArrayEquals(array, arrayOf(1,2,3,4,5))
    }

    @Test
    fun selectionSortTest() {
        var array: Array<Int> = SelectionSort().doSort(arrayOf(2,5,1,3,4))
        Assert.assertArrayEquals(array, arrayOf(1,2,3,4,5))
    }

    @Test
    fun insertionSortTest() {
        var array: Array<Int> = InsertionSort().doSort(arrayOf(5,1,4,2,3))
        Assert.assertArrayEquals(array, arrayOf(1,2,3,4,5))
    }



}