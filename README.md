# Music Composition Tool

The **Music Composition Tool** is a simple Java application that allows users to compose musical pieces by adding notes. It provides a basic interface for creating and displaying musical compositions.

## Features

- **Add Notes**: Users can add musical notes to the composition by specifying the pitch and duration.
- **Display Composition**: The tool can display the composed musical piece, showing the sequence of notes with their respective pitches and durations.

## Usage

1. **Add Notes**: Use the `addNote` method of the `Composition` class to add notes to the composition. Specify the pitch (e.g., C, D, E) and duration (in beats) of each note.
2. **Display Composition**: After adding notes, call the `display` method of the `Composition` class to view the composed musical piece.

## Getting Started

To use the Music Composition Tool in your Java project, follow these steps:

1. **Clone Repository**: Clone this repository to your local machine using the following command:
    
    ```
    git clone <repository-url>
    
    ```
    
2. **Import Classes**: Import the `Note` and `Composition` classes into your Java project.
3. **Create Composition**: Create a new `Composition` object and use the `addNote` method to add notes to it.
4. **Display Composition**: Call the `display` method of the `Composition` object to view the composed musical piece.

## Example

```java
// Create a new composition
Composition composition = new Composition();

// Add notes to the composition
composition.addNote("C", 4);
composition.addNote("D", 2);
composition.addNote("E", 3);

// Display the composition
composition.display();

```

This will output:

```
Composition:
C(4)
D(2)
E(3)

```
