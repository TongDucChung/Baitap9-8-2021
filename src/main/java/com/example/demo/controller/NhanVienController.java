package com.example.demo.controller;

import com.example.demo.models.NhanVien;
import com.example.demo.models.PhongBan;
import com.example.demo.service.INhanVienService;
import com.example.demo.service.IPhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/home")

public class NhanVienController {
    @Autowired
    INhanVienService iNhanVienService;
    @Autowired
    IPhongBanService iPhongBanService;

    @GetMapping("/show")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("list", iNhanVienService.findAll());
        return modelAndView;
    }

    @ModelAttribute("listPhongBan")
    public ArrayList<PhongBan> listPhongBan() {
        return (ArrayList<PhongBan>) iPhongBanService.findAll();
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("NhanVien", new NhanVien());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute NhanVien nhanVien) {
        iNhanVienService.saveNV(nhanVien);
        return new ModelAndView("redirect:/home/show");
    }

    @GetMapping("/Edit/{id}")
    public ModelAndView showEdit(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("Edit");
        modelAndView.addObject("NhanVien", iNhanVienService.findById(id));
        return modelAndView;
    }

    @PostMapping("/Edit/{id}")
    public ModelAndView Edit(@ModelAttribute NhanVien nhanVien) {
        iNhanVienService.saveNV(nhanVien);
        return new ModelAndView("redirect:/home/show");
    }
    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("NhanVien", iNhanVienService.findById(id));
        return modelAndView;
    }
    @PostMapping("/delete/{id}")
    public ModelAndView delete(@ModelAttribute NhanVien nhanVien,@PathVariable long id) {
        iNhanVienService.deleteNV(iNhanVienService.findById(id));
        return new ModelAndView("redirect:/home/show");
    }
    @GetMapping("/detail/{id}")
    public ModelAndView showDetail(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("showDetail");
        modelAndView.addObject("NhanVien", iNhanVienService.findById(id));
        return modelAndView;
    }
@GetMapping("/showAdmin")
public ModelAndView showAdmin() {
    ModelAndView modelAndView = new ModelAndView("showAdmin");
    return modelAndView;
}


}

