package com.notebookApp.services;

import com.notebookApp.data.models.Note;
import com.notebookApp.data.repositories.NoteRepository;
import com.notebookApp.dtos.requests.EditNoteRequest;
import com.notebookApp.dtos.requests.NoteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;

    List<Note> notes = new ArrayList<>();

    @Override
    public void createNote(NoteRequest noteRequest) {
        Note note = new Note();
        note.setTopic(noteRequest.getTopic());
        note.setNoteBody(noteRequest.getNoteBody());
        noteRepository.save(note);
    }

    @Override
    public List<Note> viewAllNote() {
        return noteRepository.findAll();
    }

    @Override
    public Note viewById(String id) {
        return noteRepository.findNoteByNoteId(id);
    }

    @Override
    public void deleteById(String id) {
        noteRepository.deleteById(id);

    }

    @Override
    public Note editNote(String id, EditNoteRequest editNoteRequest) {

        Note foundNote = noteRepository.findNoteByNoteId(id);
        foundNote.setTopic(editNoteRequest.getTopic());
        foundNote.setNoteBody(editNoteRequest.getNoteBody());
        return noteRepository.save(foundNote);
    }
}
