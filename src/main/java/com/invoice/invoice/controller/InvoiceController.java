package com.invoice.invoice.controller;

import com.invoice.invoice.entities.Invoice;
import com.invoice.invoice.entities.Product;
import com.invoice.invoice.service.ClientService;
import com.invoice.invoice.service.InvoiceService;
import com.invoice.invoice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class InvoiceController  {
    //TODO
    InvoiceService invoiceService;
    ClientService clientService;
    ProductService productService;
    @GetMapping("//")
    public String home() {
        return "home";
    }

    @GetMapping("/all_Invoices")
    public ModelAndView getAllInvoices() {
        List<Invoice> list = new ArrayList<>();
        list = invoiceService.findAll();
        return new ModelAndView("allInvoices", "invoice", list);
    }

    @GetMapping("/saveInvoice")
    public String addInvoice(Model model) {
        Invoice invoice;
        model.addAttribute("invoice", new Invoice());

        return "createInvoices";
    }

    @PostMapping("/saveInvoice")
    public String SaveInvoice(Invoice invoice) {

        invoiceService.save(invoice);

        return "redirect:/all_Invoices";
    }

}


