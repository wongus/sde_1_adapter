package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // initialise components
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        Adapter adapter = new Adapter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // set answers that will return a positive answer
        ArrayList<String> answers = new ArrayList<String>();
        Collections.addAll(answers, "true", "yes", "oh yeah", "great", "sure",
                "love to", "of course", "always", "never done otherwise");

        adapter.addAnswers(answers);

        // read response
        Boolean ans1 = adapter.adapt(reader.readLine());


        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}