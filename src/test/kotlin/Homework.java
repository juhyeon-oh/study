import org.example.Homework
import org.testng.annotations.Test
import org.testng.Assert.assertEquals

class HomeWorkTest {
    private val HW1: Homework = Homework()

    @Test
    fun addition() {
        val result = HW1.calculate(80)
        assertEquals(result.last(), 72)
    }
}
