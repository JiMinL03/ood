/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author 915-13
 */
@Controller
public class Ch02Controller {
    @GetMapping("ch02")
    public String ch02(){
        return "ch02/index"; //ch02 폴더의 index.jsp
    }
}
