package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.SaleEntity;
import com.example.demo.service.ProductService;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class WebController {
    @Autowired
    ProductService productService;

    @Autowired
    SaleService saleService;

    @GetMapping({"/product"})
    public String product_index(Model model) {
        List<ProductEntity> list_product = productService.getAllProduct();
        model.addAttribute("list_product", list_product);
        return "product_index";
    }

    @GetMapping({"/sale"})
    public String sale_index(Model model) {
        List<SaleEntity> list_sale = saleService.getAllSale();
        model.addAttribute("list_sale", list_sale);
        return "sale_index";
    }

//    @GetMapping("ListProduct")
//    public String ListProduct(Model model, HttpSession session) {
////        List<Product> products = productService.getAllProduct();
////        model.addAttribute("products", products);
////        return "Product/ListProduct";
//        if (session.getAttribute("NAME") != null) {
//            return findPaginated(1, "name", "asc", model);
//        }
//        return "login";
//    }
//
//    @GetMapping("searchProduct")
//    public String Search(Model model, @RequestParam(defaultValue = "name") String name) {
//        model.addAttribute("products", productService.findByNameLike(name));
//        return "Product/ListProduct";
//    }
//
//    @GetMapping("/addProduct")
//    public String AddProduct(Model model) {
//        Product product = new Product();
//        model.addAttribute("product", product);
//        return "Product/AddProduct";
//    }
//
//    @PostMapping("/saveProduct")
//    public String saveProduct(@ModelAttribute Product product) {
//        productService.saveProduct(product);
//        return "redirect:/ListProduct";
//    }
//
////    @PostMapping("/saveProduct")
////    public String addUser(@RequestParam("name") String name, @RequestParam("price") int price, @RequestParam("quantity") int quantity, @RequestParam("categoryid") int categoryid, Model model, MultipartFile image){
////        Product product = new Product();
////        product.setName(name);
////        product.setPrice(price);
////        product.setQuantity(quantity);
////        product.setCategoryid(categoryid);
////        if(image.isEmpty()){
////            return "Product/ListProduct";
////        }
////        Path path = Paths.get("uploads/");
////        try {
////            InputStream inputStream = image.getInputStream();
////            Files.copy(inputStream, path.resolve(image.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
////            product.setImage(image.getOriginalFilename().toLowerCase());
////            model.addAttribute("product", product);
////        }catch (Exception e){
////            e.printStackTrace();
////        }
//////        productService.saveProduct(product);
////        return "Product/ListProduct";
////    }
//
//    @GetMapping("/update")
//    public String updateProduct(@RequestParam int id, Model model) {
//        Product product = productService.getProductById(id);
//        model.addAttribute("product", product);
//        return "Product/UpdateProduct";
//    }
//
//    @GetMapping("/delete")
//    public String deleteProduct(@ModelAttribute(value = "id") int id) {
//        productService.deleteProduct(id);
//        return "redirect:/ListProduct";
//    }
//
//
//    @GetMapping("/page/{pageNo}")
//    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, @RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir, Model model) {
//        int pageSize = 5;
//        Page<Product> page = productService.findPaginated(pageNo, pageSize, sortField, sortDir);
//        List<Product> products = page.getContent();
//
//        model.addAttribute("currentPage", pageNo);
//        model.addAttribute("totalPages", page.getTotalPages());
//        model.addAttribute("totalItems", page.getTotalElements());
//
//        model.addAttribute("sortField", sortField);
//        model.addAttribute("sortDir", sortDir);
//        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
//
//        model.addAttribute("products", products);
//        return "Product/ListProduct";
//
//    }
}
