package com.notebookApp.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Note {
    @Id
    private String noteId;

    private String topic;
    private String noteBody;

    private LocalDateTime creationTime = LocalDateTime.now();



}
