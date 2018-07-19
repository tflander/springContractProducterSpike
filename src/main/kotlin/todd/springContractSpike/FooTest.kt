package todd.springContractSpike

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.Before


open class FooTest {

    @Before
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(FooController())
    }
}