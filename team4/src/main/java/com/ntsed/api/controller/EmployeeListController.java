package com.ntsed.api.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ntsed.api.entity.EmployeeListInfo;
import com.ntsed.api.service.EmployeeListService;

//import jakarta.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

/*
 * author: 高根沢
 * date:2023/12/22
 * 
*/


@Controller
@RequestMapping("/employees")
public class EmployeeListController {
    private final EmployeeListService employeeService;

	/* @Autowired */
    public EmployeeListController(EmployeeListService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String getAllEmployees(Model model) {
        List<EmployeeListInfo> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
//        return "TestIndex"; // このテンプレート名は適宜変更してください
        return "EmployeeList";
    }
    
//    @PostMapping("/search")
//    public String search(HttpServletRequest request) {
//        String[] selectedIds = request.getParameterValues("selectedIds");
//        
//        // 選択されたIDの処理を行う（例: ログ出力）
//        if (selectedIds != null) {
//            for (String id : selectedIds) {
//                System.out.println("Selected ID: " + id);
//            }
//        }
//        
//        // 他の処理や遷移先を返す
////        return "redirect:/result"; // 例えば、結果画面へのリダイレクト
//        return "TestIndex2";
//    }
    
//    @PostMapping("/edit")
//    public String edit(HttpServletRequest request) {
//        String[] selectedIds = request.getParameterValues("selectedIds");
//        
//        // 選択されたIDの処理を行う（例: ログ出力）
//        if (selectedIds != null) {
//            for (String id : selectedIds) {
//                System.out.println("Selected ID: " + id);
//            }
//        }
//        
//        // 他の処理や遷移先を返す
////        return "redirect:/result"; // 例えば、結果画面へのリダイレクト
//        return "TestIndex2";
//    }
}
