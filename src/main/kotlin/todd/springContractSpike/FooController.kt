package todd.springContractSpike

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class FooController {

    @GetMapping("foo")
    fun foo(@RequestParam request: FooRequest): FooResponse {
        return FooResponse(request.foo + "!!!");
    }
}