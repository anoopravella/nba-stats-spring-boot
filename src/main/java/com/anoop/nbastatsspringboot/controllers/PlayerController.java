package com.anoop.nbastatsspringboot.controllers;

import com.anoop.nbastatsspringboot.Player;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @RequestMapping("/")
    public String index() {
        return "Search a player name!";
    }
}
