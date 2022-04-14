package com.example.OCR.OCR.controller;

import com.example.OCR.OCR.models.TaskData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OcrController {
    @PostMapping("/ocr")
    public ResponseEntity<?> ocr(@RequestBody TaskData taskData){
        try {
            Thread.sleep(15000);
            return new ResponseEntity<>(taskData,HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
