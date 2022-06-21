import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getTypeCard() {


    }

    @Test
    fun setTypeCard() {
        val typeCardNumber = 5

        when (typeCardNumber) {
            1 -> "VK pay"
            2 -> "Maestro, Mastercard"
            3 -> "VISA, MIR"
            else -> {
                error("Не поддерживаемая система оплаты")
            }
        }
    }

    @Test
    fun getAmountSum() {

    }

    @Test
    fun setAmountSum() {
    }

    @Test
    fun getAmount() {
    }

    @Test
    fun setAmount() {
    }

    @Test
    fun main() {
    }

    @Test
    fun commission() {
        val typeCard = "Maestro"
        val amountSum = 30000

        when (typeCard) {
            "Maestro, Mastercard" -> if (amountSum < MAESTRO_MASTERCARD_FREE_LIMIT) {
                0
            } else {
                amount * 6 / 1000 + 2000
            }
            "VISA, MIR" -> if (amount * 75 / 10000 < MIR_VISA_MIN_COMMISSION) {
                MIR_VISA_MIN_COMMISSION
            } else {
                amount * 75 / 10000
            }
            "VK pay" -> 0
            else -> 0
        }

    }
}