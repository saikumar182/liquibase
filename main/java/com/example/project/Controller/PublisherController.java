package com.example.project.Controller;

import com.example.project.Entites.Publisher;
import com.example.project.Repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublisherController {




    @Autowired
    PublisherRepo publisherRepo;

    @GetMapping("/publisher")
    List<Publisher> getAllPublishers(){

        return publisherRepo .findAll();
    }


}
