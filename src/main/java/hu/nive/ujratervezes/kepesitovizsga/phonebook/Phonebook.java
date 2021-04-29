package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Parameter must not be null!");
        }

        Path path = Path.of(output);
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            writeToFiles(bw, contacts);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write phone number(s).", ioe);
        }
    }

    private void writeToFiles(BufferedWriter bw, Map<String, String> contacts) throws IOException {
        for (String name : contacts.keySet()) {
            String phoneNumber = contacts.get(name);
            bw.write(name);
            bw.write(": ");
            bw.write(phoneNumber);
            bw.write("\n");
        }
    }
}
