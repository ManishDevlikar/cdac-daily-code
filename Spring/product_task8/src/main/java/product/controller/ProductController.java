package product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import product.model.Product;

@Controller
@SessionAttributes({ "products" })
public class ProductController {

	private List<Product> products = new ArrayList<>();

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/add")
	public String getAddJsp() {
		return "add";
	}

	@GetMapping("/search")
	public String getSearchJsp() {
		return "search";
	}

	@GetMapping("/searchProduct")
	public String searchProduct(@RequestParam("id") int id, Model model) {
		Product p = null;
		for (Product product : products) {
			if (product.getId() == id) {
				p = product;
			}
		}
		if (p != null) {
			model.addAttribute("product", p);
		} else {
			model.addAttribute("message", "Not Found");
		}
		return "searchPage";
	}

	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute("products") List<Product> productList, Product product, Model model) {
		productList.add(product);

		model.addAttribute("products", products);

		return "index";
	}

	@ModelAttribute("products")
	public List<Product> initializeProducts() {
		return products;
	}

}
