package com.notebookApp.dtos.requests;

import lombok.Data;

@Data
public class NoteRequest {
    private String noteId;
    private String topic;
    private String noteBody;

}
