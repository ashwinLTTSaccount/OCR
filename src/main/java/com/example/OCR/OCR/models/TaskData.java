package com.example.OCR.OCR.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskData {
    private String pageId;
    private String userId;
    private String specialistId;
    private String documentId;
    private String totalNoOfPages;
    private String extractionType;
    private String pageNumber;
    private String projectId;
    private int multiplier;
}