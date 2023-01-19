package com.notebookApp.dtos.requests;

import lombok.Data;

@Data
public class EditNoteRequest {
    private String topic;
    private String noteBody;
}
