package com.invoice.invoice.controller;

import com.invoice.invoice.entities.Client;
import com.invoice.invoice.entities.Product;
import com.invoice.invoice.service.ClientService;
import com.invoice.invoice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/all_Products")
    public ModelAndView getAllProducts() {
        List<Product> list = new ArrayList<>();
        list = productService.findAll();
        return new ModelAndView("allProducts", "product", list);
    }

    @GetMapping("/saveProduct")
    public String addProduct(Model model) {
        Product product;
        model.addAttribute("product", new Product());

        return "createProducts";
    }

    @PostMapping("/saveProduct")
    public String SaveProduct(Product product) {

        productService.save(product);

        return "redirect:/all_Products";
    }

}


