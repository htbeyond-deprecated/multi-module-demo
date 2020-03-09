package dominiqn.multimodule.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AliveController {
    @GetMapping("/alive")
    fun hello() = mapOf("hello" to "how's it going?")
}