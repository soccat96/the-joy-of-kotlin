package chapter01

fun buyDonuts(quantity: Int = 1, creditCard: CreditCard): Purchase =
    Purchase(
        List(quantity) { Donut() },
        Payment(creditCard, Donut.price * quantity)
    )

class Donut {
    companion object {
        const val price: Int = 1000
    }
}

class CreditCard {
    fun charge(price: Int) {

    }
}

class Payment(val creditCard: CreditCard, val amount: Int) {
    companion object {
        fun groupByCard(payments: List<Payment>): List<Payment> =
            payments
                .groupBy { it.creditCard }.values
                .map { it.reduce(Payment::combine) }
    }

    fun combine(payment: Payment): Payment =
        if (creditCard == payment.creditCard)
            Payment(creditCard, amount + payment.amount)
        else throw IllegalStateException("Cards don't match.")
}

//class chapter01.Purchase(val donut: chapter01.Donut, val payment: chapter01.Payment)
class Purchase(val donuts: List<Donut>, val payment: Payment)