package com.notebookApp.controllers;

import com.notebookApp.data.models.Note;
import com.notebookApp.dtos.requests.EditNoteRequest;
import com.notebookApp.dtos.requests.NoteRequest;
import com.notebookApp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    @Autowired
    NoteService noteService;

    @PostMapping("/note")
    public String createNote( @RequestBody NoteRequest noteRequest){
        noteService.createNote(noteRequest);
        return "note created successfully";
    }

    @RequestMapping(value = "/note/{noteId}", method = RequestMethod.GET)

    public Note viewById(@PathVariable String noteId){
      return noteService.viewById(noteId);

    }
    @RequestMapping(value = "/note", method = RequestMethod.GET)
    public List<Note> viewAllNote(){
        return noteService.viewAllNote();
    }
    @RequestMapping(value = "/note/{noteId}", method = RequestMethod.DELETE)
    public void deleteNoteById( @PathVariable String noteId){
        noteService.deleteById(noteId);
    }

    @RequestMapping(value = "/note/{noteId}", method = RequestMethod.PATCH)
    public Note updateNote(@PathVariable ("noteId")String noteId , @RequestBody EditNoteRequest editNoteResponse){
       return noteService.editNote(noteId,editNoteResponse);

    }
}
