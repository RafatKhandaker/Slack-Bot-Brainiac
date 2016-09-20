package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.network.Slack;

import java.util.Random;
import java.util.Timer;

import static nyc.c4q.ramonaharrison.network.Slack.BOTS_CHANNEL_ID;
import static nyc.c4q.ramonaharrison.network.Slack.delay;

/**
 * Created by c4q on 9/20/16.
 */

/** Rafat:  I was thinking that I can create a loop like a game, to have the bot migrate between channels and create
 *          A standard of difficulty and a creative element in chat. The bot will engage in asking users questions about
 *          each other. IT will prompt another user to answer a question of a user in the chat. The user will receive penalty
 *          for wrong answers and will damage the bot for right answers. The bot will go through sleep mode and upgrade
 *          to different "Alert Levels"
 **/
public class channelHop {

    public static String general = "C2CSB9HD2";
    public static String randomCh = "C2CSE9V0W";
    public static String alertlevel1 = "C2DFTH07P";
    public static String alertlevel2 = "C2DG4AL8J";
    public static String alertlevel3 = "C2DG4B5GA";
    public static String alertlevel4 = "C2DE5PKMH";
    public static String channel;

    public static String getChannel(){
        return channel;
    }



}
