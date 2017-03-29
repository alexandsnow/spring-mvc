package com.alex.realm.controller;

import com.alex.realm.utils.PoiExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Created by yang_gao on 2017/3/27.
 */
@RestController
@RequestMapping(value = "File/")
public class FileController {

    @Autowired
    PoiExcelUtil poxUtil;

    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public String uploadExcel(@RequestParam(value = "file", required = false) MultipartFile file,
                              HttpServletRequest request,
                              HttpServletResponse response) {
        String fileName = file.getOriginalFilename();
        System.out.println("upload success");
        File file_save = new File("D:\\"+fileName);
        try {
            file.transferTo(file_save);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
