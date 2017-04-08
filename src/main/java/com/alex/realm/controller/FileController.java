package com.alex.realm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by yang_gao on 2017/3/27.
 */
@RestController
@RequestMapping(value = "File/")
public class FileController {

    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String uploadExcel(@RequestParam(value = "file", required = false) MultipartFile file) {
        String fileName = file.getOriginalFilename();
        File file_save = new File("D:\\" + fileName);
        try {
            file.transferTo(file_save);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
