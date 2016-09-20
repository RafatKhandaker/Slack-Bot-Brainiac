package nyc.c4q.ramonaharrison;

import javafx.scene.control.Alert;
import nyc.c4q.ramonaharrison.model.Field;
import nyc.c4q.ramonaharrison.model.User;
import nyc.c4q.ramonaharrison.network.Slack;
import nyc.c4q.ramonaharrison.network.response.ListChannelsResponse;
import nyc.c4q.ramonaharrison.network.response.extractChannel;

import java.util.HashMap;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

import static nyc.c4q.ramonaharrison.alertLevel.*;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> phrase = new ArrayList();

        phrase.add("The will of Brainiac cannot be broken");
        phrase.add("All will be one with Brainiac!");
        phrase.add("Brainiac Knows All");
        phrase.add("Technology is Man's greatest weakness, Brainiac is one with Technology");
        phrase.add("You are permitted to ask Brainiac for help");
        phrase.add("Is Brainiac not the Greatest?");

        System.out.println(phrase);

        Random randNum = new Random();

// HOME SWEEPING
        Bot myBot = new Bot();
        myBot.testApi();
        myBot.listChannels();
        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        Slack.sendMessage("Welcome to Brainiac, All hail Brainiac, All will be One with Brainiac!");

        channelHop.startAlert();

    }
}