package com.example.uts_10120150;
//10120150-Rahmat-IF4
import android.database.Cursor;

import com.example.uts_10120150.model.Note;

public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}