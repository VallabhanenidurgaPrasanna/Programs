package com.bitlabs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bitlabs.Dao.ProductDao;
import com.bitlabs.ProductModel.Productclass;

@Controller
public class ProductController {

	@Autowired
	private ProductDao dao;

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute Productclass product, Model model) {
		this.dao.addProduct(product);
		return "success";
	}

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Productclass> list = this.dao.getAll();
		model.addAttribute("products",list);
		return "allProducts";
	}
	
	@RequestMapping("/getProductById")
	public String getProductById(@RequestParam("id") int id,Model model) {
		Productclass pro=this.dao.getProductById(id);
		model.addAttribute("product1",pro);
		return "getproduct";
		
	}
	
	@RequestMapping("/getbyid")
	public String getproduct() {
		return "getbyid";
	}
	
	@RequestMapping("/delete/{id}")
	public String getAll(@PathVariable("id") int id) {
		this.dao.delete(id);
		return "success";
	}
	
	@RequestMapping("/update/{id}")
	public String getAll(@PathVariable("id") int id, Model model) {
		Productclass productclass = this.dao.getProductById(id);
		model.addAttribute("product", productclass);
		return "index1";
	}

}
