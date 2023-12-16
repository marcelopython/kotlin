import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Testa protaria")
    fun testPortaria() {

        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(18, "", ""), "Negado.")
        Assertions.assertEquals(portaria(18, "Penetra", "QW"), "Negado.")
        Assertions.assertEquals(portaria(18, "premium", "QW"), "Negado.")
        Assertions.assertEquals(portaria(18, "comum", "XT"), "Welcome.")
        Assertions.assertEquals(portaria(18, "luxo", "xl"), "Welcome.")


    }


//    @Test
//    fun provovacao() {
//        Assertions.assertNotNull(countXO("asdfasdfdsf"))
//        Assertions.assertNotNull(countXO("xxoo"))
//        Assertions.assertNotNull(countXO("xxxxo"))
//    }
//
//    @Test
//    @DisplayName("Testse metodo XXOO")
//    fun testCountXO() {
//
//        Assertions.assertAll(
//            {Assertions.assertTrue(countXO("xxoo"))},
//            {Assertions.assertTrue(countXO("xxoo"))},
//            {Assertions.assertTrue(countXO("xxoo"))},
//            {Assertions.assertTrue(countXO("xxoo"))},
//            { Assertions.assertEquals(countXO("xxoo"), true)}
//        )
//
//    }
//
//    @Test
//    @Disabled
//    fun naoImplmentado() {
//
//    }
//
//    @Test
//    fun vaiFalhar() {
//        fail("Não posso terminar os teste sem esse método.")
//    }
//
//    @Test
//    fun assumption() {
//
//        // So roda o teste abaixo caso essa condição seja verdade
//        Assumptions.assumeTrue(countXO("xxxoo"))
//        Assertions.assertTrue(abc())
//
//    }
//
//    @Test
//    fun exception() {
//        assertThrows<NullPointerException> {
//            abc()
//        }
//    }


}