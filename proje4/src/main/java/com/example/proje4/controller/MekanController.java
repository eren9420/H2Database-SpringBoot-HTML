package com.example.proje4.controller;


import com.example.proje4.entity.Mekan;
import com.example.proje4.service.MekanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MekanController {
    @Autowired
    MekanService service;

    @GetMapping("/")
    public String findall(Model model){
        model.addAttribute("mekanlar" ,service.findAllMekan());
        return "mekanlar/allmekanlar";

    }
    @GetMapping("/add")
    public String launchaddMekan (Model model){
        model.addAttribute("mekan" ,new Mekan());

        return "mekanlar/addmekanlar";

    }
    @PostMapping ("/addmekan")
    public String addMekan(Mekan mekan){
    service.addMekan(mekan);
    return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String launcheditMekan(Model model ,@PathVariable ("id") int id){
        model.addAttribute("mekan" ,service.findMekanbyId(id));
        return "mekanlar/editmekanlar";
    }
    @PostMapping ("/updatemekan")
    public String updatemekan(Mekan mekan){
        service.updateMekan(mekan);
        return "redirect:/";
    }
    @GetMapping ("/delete/{id}")
    public String deletemekan(@PathVariable ("id") int id){
        service.deletebyId(id);
        return "redirect:/";

    }
    @GetMapping ("/deleteall")
    public String deleteAllmekan(){
        service.deleteAll();
        return "redirect:/";

    }


    @GetMapping("/test")
    public String test(){
        Mekan yenimekan = new Mekan();
        yenimekan.setId(1);
        yenimekan.setMekanisim("A");
        yenimekan.setRating(8);
        yenimekan.setSemt("Kadıköy");
        yenimekan.setYorum("Super mekan");
        service.addMekan(yenimekan);

        return "index";


    }
}
