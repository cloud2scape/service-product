package org.sesac.market.product.adapter.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {
    @GetMapping
    public String home() {
        return "<h2>Product Server</h2>";
    }
}
