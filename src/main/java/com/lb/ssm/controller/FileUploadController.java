package com.lb.ssm.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    @PostMapping("/image")
    public String uploadImage(@RequestParam MultipartFile multipartFile) {
        return "";
    }
}