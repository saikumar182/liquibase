package com.example.project.Controller;

import com.example.project.Entites.Titles;
import com.example.project.Repository.TitlesRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class TitleController {

    @Autowired
    TitlesRepo titlesRepo;

    @GetMapping("/titles")
    List<Titles> getAllTitles(){
        return titlesRepo.findAll();
    }
//@PutMapping("adding titles/{id}")
//
//        public  List<Titles>updateTheTitles( @PathVariable (value ="id") int id ,@ResponseBody Titles titles ){
//
//        Titles tit = titlesRepo.findAllById(Id);
//        tit.setPrice(titles.getPrice());
//    tit.setPrice(titles.getTitle());
//    titlesRepo.save(tit);
//
//
//
//
//}
//
//
//return Titles;

//    @DeleteMapping("/deleteById/id")
//
//    public void deleteProductById(@RequestParam int id) {
//
//        var p1= titlesRepo.findById(id);
//        if (p1.isPresent())
//
//            titlesRepo.deleteById(title_id);
//        else
//
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer Id Not Found");
//
//    }
//}




}
