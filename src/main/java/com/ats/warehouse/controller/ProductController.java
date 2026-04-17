package com.ats.warehouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

@GetMapping("/test")
public String testApi()
{
    return "warehouse management system in Mahindra chakan";
}

}
