const val MAESTRO_MASTERCARD_FREE_LIMIT = 7_500_000
const val MIR_VISA_MIN_COMMISSION = 3_500
var typeCard: String = "VK pay"
var amountSum = 0
var amount = 0


fun main() {

    print("Введите сумму перевода в копейках: ")
    amount = readLine()?.toInt() ?: return
    amountSum += amount
    print(
        "Для выбора типа карты/счета введите соответствующий номер:" +
                "VK pay - 1 " +
                "Maestro, - 2 " +
                "Visa - 3" +
                "Mastercard - 4 " +
                "МИР - 5 :"
    )

    val typeCardNumber = readLine()?.toInt() ?: return
    typeCard = when (typeCardNumber) {
        1 -> "VK pay"
        2 -> "Maestro"
        3 -> "VISA, "
        4 -> "Mastercard"
        5 -> "MIR"
        else -> {
            error("Не поддерживаемая система оплаты")
        }

    }
    val result = commission(amount, amountSum, typeCard)
    println("Сумма комиссии за перевод: $result копеек")

}

fun commission(amount: Int, amountSum: Int, typeCard: String) = when (typeCard) {
    "Maestro", "Mastercard" -> if (amountSum < MAESTRO_MASTERCARD_FREE_LIMIT) {
        0
    } else {
        amount * 6 / 1000 + 2000
    }
    "VISA", "MIR" -> if (amount * 75 / 10000 < MIR_VISA_MIN_COMMISSION) {
        MIR_VISA_MIN_COMMISSION
    } else {
        amount * 75 / 10000
    }
    "VK pay" -> 0
    else -> 0
}
