package todd.springContractSpike

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import io.restassured.RestAssured.*
import io.restassured.matcher.RestAssuredMatchers.*
import org.hamcrest.Matchers.*

@RunWith(SpringRunner::class)
@SpringBootTest
class SpringContractSpikeApplicationTests {

	@Test
	fun contextLoads() {
	}

}
