import java.util.ArrayList;
import java.util.List;

// Represents a musical note
class Note {
    private String pitch;
    private int duration;

    public Note(String pitch, int duration) {
        this.pitch = pitch;
        this.duration = duration;
    }

    public String getPitch() {
        return pitch;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return pitch + "(" + duration + ")";
    }
}

// Represents a musical composition
class Composition {
    private List<Note> notes;

    public Composition() {
        notes = new ArrayList<>();
    }

    public void addNote(String pitch, int duration) {
        notes.add(new Note(pitch, duration));
    }

    public void display() {
        System.out.println("Composition:");
        for (Note note : notes) {
            System.out.println(note);
        }
    }
}

public class MusicCompositionTool {
    public static void main(String[] args) {
        // Create a new composition
        Composition composition = new Composition();

        // Add notes to the composition
        composition.addNote("C", 4);
        composition.addNote("D", 2);
        composition.addNote("E", 3);

        // Display the composition
        composition.display();
    }
}
