package com.notebookApp.services;

import com.notebookApp.data.models.Note;
import com.notebookApp.data.models.User;
import com.notebookApp.dtos.requests.NoteRequest;
import com.notebookApp.dtos.requests.UserRequest;

import java.util.List;

public interface UserService {
    void userRegister(UserRequest userRequest);
    User userLogin(String id,User user);
    Note createNote(NoteRequest noteRequest);
    void deleteNoteById(String id);
//    Note updateNote();
    List<Note> viewAllNote();


}
