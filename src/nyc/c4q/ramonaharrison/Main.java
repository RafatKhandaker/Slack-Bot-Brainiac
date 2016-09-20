package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.network.Slack;
import java.util.Random;
import java.util.ArrayList;
import java.util.Timer;

import static nyc.c4q.ramonaharrison.channelHop.*;


public class Main {

    public static void main(String[] args) {
        channel = general;
        Slack.sendMessage("Welcome to Brainiac, All hail Brainiac, All will be One with Brainiac!");
        homeSweep();
        StringstartAlert();



// HOME SWEEPING


    }
    public static void homeSweep() {
        Bot myBot = new Bot();
        myBot.testApi();
        myBot.listChannels();
        myBot.listMessages(Slack.BOTS_CHANNEL_ID);



        //channelHop.startAlert();
    }

    public static String randPhraseGenerator(){
        ArrayList<String> phrase = new ArrayList();
        Random random = new Random();

        int randval = random. nextInt(5);

        switch(randval) {
            case 0:
            phrase.add("The will of Brainiac cannot be broken");
                break;
            case 1:
                phrase.add("All will be one with Brainiac!");
                break;
            case 2:
            phrase.add("Brainiac Knows All");
                break;
            case 3:
            phrase.add("Technology is Man's greatest weakness, Brainiac is one with Technology");
                break;
            case 4:
            phrase.add("You are permitted to ask Brainiac for help");
                break;
            case 5:
            phrase.add("Is Brainiac not the Greatest?");
                break;

        }
        return phrase.get(0);

    }

    public static void StringstartAlert() {
        Timer time = new Timer();
        Random random = new Random();
        int randNum = random.nextInt(5);

        int x = 0;

        while(true) {
            switch (x){
                default:
                    Slack.BOTS_CHANNEL_ID = getChannel();
                    Main.homeSweep();
                    Slack.sendMessage("Brainiac is now Engaged: He will now ask users questions");
                    Slack.delay(randNum);
                    channel = general;

                    x++;

                    break;

                case 1:
                    channel = alertlevel1;
                    Slack.BOTS_CHANNEL_ID = getChannel();
                    Main.homeSweep();
                    Slack.sendMessage("Brainiac is now in Alert Level 1: He will start attacking users");
                    Slack.delay(randNum);

                    x++;

                    break;

                case 2:
                    channel = alertlevel2;
                    Slack.BOTS_CHANNEL_ID = getChannel();
                    Main.homeSweep();
                    Slack.sendMessage("Brainiac is now in ALert Level 2: Brainiac can now be attacked");
                    Slack.delay(randNum);

                    x++;

                    break;

                case 3:
                    channelHop.channel = alertlevel3;
                    Slack.BOTS_CHANNEL_ID = getChannel();
                    Main.homeSweep();
                    Slack.sendMessage("Brainiac is now in ALert level 3: Removed users will now turn into BrainBots");
                    Slack.delay(randNum);

                    x++;

                    break;

                case 4:
                    channelHop.channel = alertlevel4;
                    Slack.BOTS_CHANNEL_ID = getChannel();
                    Main.homeSweep();
                    Slack.sendMessage("Brainiac is now in Alert level 4: Brainiac can now attack users in all channels");
                    Slack.delay(randNum);

                    x++;

                    break;

                case 5:
                    channelHop.channel = randomCh;
                    Slack.BOTS_CHANNEL_ID = getChannel();
                    Main.homeSweep();
                    Slack.sendMessage("Brainiac is now in Random Mode: Brainiac will post random memes in Random Channel");
                    Slack.delay(randNum);

                    x++;

                    break;

                case 6:
                    channelHop.channel = general;
                    Slack.BOTS_CHANNEL_ID = getChannel();
                    Main.homeSweep();
                    Slack.sendMessage("Brainiac is now in Defcon 5 mode: Brainiac will regain health every minute");
                    Slack.sendMessage("Brainiac has been subdued and put to sleep mode");
                    Slack.delay(randNum);

                    x=0;

                    break;

            }

        }

    }
}