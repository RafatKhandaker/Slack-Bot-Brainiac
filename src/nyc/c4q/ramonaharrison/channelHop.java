package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.network.Slack;

import java.util.Random;
import java.util.Timer;

import static nyc.c4q.ramonaharrison.network.Slack.delay;

/**
 * Created by c4q on 9/20/16.
 */


public class channelHop {

    private static String general = "C2CSB9HD2";
    private static String random = "C2CSE9V0W";
    private static String alertlevel1 = "C2DFTH07P";
    private static String alertlevel2 = "C2DG4AL8J";
    private static String alertlevel3 = "C2DG4B5GA";
    private static String alertlevel4 = "C2DE5PKMH";
    public static String channel = general;

    public static String startAlert() {
        Timer time = new Timer();
        Random random = new Random();
        int randNum = random.nextInt(5);

            int x = 0;
            int delayTime = randNum;

            while(true) {
                switch (x){
                    default:
                        Slack.sendMessage("Brainiac is now Engaged: He will now ask users questions");
                        Slack.delay(randNum);
                        x++;
                        return channel;

                    case 1:
                        Slack.sendMessage("Brainiac is now in Alert Level 1: He will start attacking users");
                        Slack.delay(randNum);
                        x++;
                        return channel;

                    case 2:
                        Slack.sendMessage("Brainiac is now in ALert Level 2: Brainiac can now be attacked");
                        Slack.delay(randNum);
                        x++;
                        return channel;

                    case 3:
                        Slack.sendMessage("Brainiac is now in ALert level 3: Removed users will now turn into BrainBots");
                        Slack.delay(randNum);
                        x++;
                        return channel;

                    case 4:
                        x++;
                        Slack.sendMessage("Brainiac is now in Alert level 4: Brainiac can now attack users in all channels");
                        Slack.delay(randNum);
                        return channel;

                    case 5:
                        x++;
                        Slack.sendMessage("Brainiac is now in Random Mode: Brainiac will post random memes in Random Channel");
                        Slack.delay(randNum);
                        return channel;

                    case 6:
                        Slack.sendMessage("Brainiac is now in Defcon 5 mode: Brainiac will regain health every minute");
                        Slack.sendMessage("Brainiac has been subdued and put to sleep mode");

                        Slack.delay(randNum);
                        x = 0;
                        return channel;

                }

            }

    }


}