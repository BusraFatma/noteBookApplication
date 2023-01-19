package com.notebookApp.services;

import com.notebookApp.data.models.Note;
import com.notebookApp.data.models.User;
import com.notebookApp.data.repositories.UserRepository;
import com.notebookApp.dtos.requests.NoteRequest;
import com.notebookApp.dtos.requests.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    NoteService noteService;

    @Override
    public void userRegister(UserRequest userRequest) {
        User user = new User();
        user.setUserName(userRequest.getUserName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(user.getPassword());
        userRepository.save(user);

    }

    @Override
    public User userLogin(String id, User user) {
        return null;
    }

    @Override
    public Note createNote(NoteRequest noteRequest) {
        Note note = new Note();
        noteService.createNote(noteRequest);
        return note;
    }

    @Override
    public void deleteNoteById(String id) {
        noteService.deleteById(id);

    }

    @Override
    public List<Note> viewAllNote() {
        noteService.viewAllNote();
        return null;
    }
}
