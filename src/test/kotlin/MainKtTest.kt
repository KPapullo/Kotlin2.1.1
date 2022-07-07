import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun maestroFreeLimit() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 0
        val typeCard1 = "Maestro"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(0, result)

    }
    @Test
    fun maestroNoFreeLimit() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 10_000_000
        val typeCard1 = "Maestro"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(2600, result)

    }
    @Test
    fun mastercardFreeLimit() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 0
        val typeCard1 = "Mastercard"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(0, result)

    }
    @Test
    fun mastercardNoFreeLimit() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 10_000_000
        val typeCard1 = "Mastercard"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(2600, result)

    }
    @Test
    fun visaUnderMinCommission() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 0
        val typeCard1 = "VISA"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(3500, result)

    }
    @Test
    fun visaUpperMinCommission() {
        // arrange

        val amount1 = 1_000_000
        val amountSum1 = 10_000_000
        val typeCard1 = "VISA"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(7500, result)

    }
    @Test
    fun mirUnderMinCommission() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 0
        val typeCard1 = "MIR"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(3500, result)

    }
    @Test
    fun mirUpperMinCommission() {
        // arrange

        val amount1 = 1_000_000
        val amountSum1 = 10_000_000
        val typeCard1 = "MIR"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(7500, result)

    }
    @Test
    fun vkPayCommission() {
        // arrange

        val amount1 = 100_000
        val amountSum1 = 20_000_000
        val typeCard1 = "VK pay"

        // act
        val result = commission(amount = amount1, amountSum = amountSum1, typeCard = typeCard1)

        // assert
        assertEquals(0, result)

    }


}