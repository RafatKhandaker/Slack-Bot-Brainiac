package nyc.c4q.ramonaharrison.network.response;

import nyc.c4q.ramonaharrison.network.Slack;

/**
 * Created by c4q on 9/19/16.
 */
public class extractChannel {



    public static String extractChannel() {

        ListChannelsResponse listchann = Slack.listChannels();
        String lcString = listchann.toString();

         int x = lcString.indexOf("@");
         int chanSize = Slack.BOTS_CHANNEL_ID.length();

           lcString = lcString.substring(x, (x + chanSize));

         return lcString;
    }

}
