package chapter01

import org.junit.Test
import kotlin.test.assertEquals

internal class DonutShopKtTest {
    @Test
    fun testBuyDonut() {
        val creditCard = CreditCard()
        val purchase = buyDonuts(5, creditCard)

        assertEquals(Donut.price * 5, purchase.payment.amount)
        assertEquals(creditCard, purchase.payment.creditCard)
    }
}