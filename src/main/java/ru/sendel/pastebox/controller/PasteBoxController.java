package ru.sendel.pastebox.controller;

import org.springframework.web.bind.annotation.*;
import ru.sendel.pastebox.api.request.PasteBoxRequest;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class PasteBoxController {

    @GetMapping("/")
    public Collection<String> getPublicPasteList(){
        return Collections.emptyList();
    }



    @GetMapping("/{hash}")
    public String getByHash(@PathVariable (name = "hash", required = false) String hash){
        return hash;
    }

    @PostMapping("/")
    public String add(@RequestBody PasteBoxRequest request){

        return request.getData();
    }
}
