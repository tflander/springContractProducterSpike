package todd.springContractSpike

import org.junit.Test
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.Before



class FooTest {

    @Before
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(FooController())
    }

    @Test
    fun foo() {

    }
}