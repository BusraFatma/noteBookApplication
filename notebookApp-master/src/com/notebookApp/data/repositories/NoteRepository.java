package com.notebookApp.data.repositories;

import com.notebookApp.data.models.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note,String> {
    Note findNoteByNoteId(String id);
}
