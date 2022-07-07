import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commission() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 10_000_000
        val typeCard1 = "Maestro"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(0, result)

    }
    @Test
    fun commissionNoFreeLimit() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 10_000_000
        val typeCard1 = "Maestro"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(3000, result)

    }
}