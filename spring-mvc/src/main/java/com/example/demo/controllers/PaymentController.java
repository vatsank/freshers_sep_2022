package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Payment;
import com.example.demo.services.PaymentService;

@Controller
public class PaymentController {

	private Payment payment;
	
	@Autowired
	private PaymentService service;
	

	public PaymentController(Payment payment) {
		super();
		this.payment = payment;
	}
	
	@RequestMapping(path = "/payment",method = RequestMethod.GET)
	public String initPage(Model model) {
		
		model.addAttribute("command",payment);
		
		return "add-payment";
	}
	
	@RequestMapping(path = "/payment",method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("command") Payment obj,Model model) {
		
		this.service.save(obj);
		
		model.addAttribute("message","one Record Added");
		
		System.out.println(obj);
		return "add-payment";
	}
	
	@RequestMapping(path = "/payment/srch",method = RequestMethod.GET)
	public String initSearchPage() {
		return "search";
	}
	
	@RequestMapping(path = "/payment/srch",method = RequestMethod.POST)
	public String search(@RequestParam("customerName") String custName) {
		
		System.out.println(custName);
		return "index";
	}
}
