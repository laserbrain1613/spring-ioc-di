package se.lexicon.sequencer;

public class StudentIdSequencer {
    private static int studentIdSequencer;

    public static int nextStudentId() {
        return ++studentIdSequencer;
    }

    public static int getStudentIdSequencer() {
        return studentIdSequencer;
    }
}