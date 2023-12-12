package com.example.bewerbungstracker1;

import androidx.cardview.widget.CardView;

import com.example.bewerbungstracker1.models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
