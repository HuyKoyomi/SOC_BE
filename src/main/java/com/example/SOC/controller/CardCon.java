package com.example.SOC.controller;

import com.example.SOC.model.Card;
import com.example.SOC.respository.CardRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
public class CardCon {

    @Autowired
    private CardRes res;

    @PostMapping("/card")
    public Card createCard(@RequestBody Card card){
        return res.save(card);
    }

    @GetMapping("/card/{id}")
    public Card getCardById(@PathVariable("id") int id){
        Optional<Card> tmp = res.findById(id);
        return  tmp.get();
    }
}
