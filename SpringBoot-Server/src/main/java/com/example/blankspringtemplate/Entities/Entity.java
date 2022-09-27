package com.example.blankspringtemplate.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Entity {
    String tel;
    String psw;
    List<String> checkboxes;

//    public Entity(String tel, String psw, List<String> checkboxes) {
//        this.tel = tel;
//        this.psw = psw;
//        this.checkboxes = checkboxes;
//    }
}
