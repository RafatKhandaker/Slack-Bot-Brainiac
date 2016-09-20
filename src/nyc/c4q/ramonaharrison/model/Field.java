package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;


/**
 * I pulled the JSON  code from Jon's Repo, i didn't quite now where to start with this, but after
 * reading through the JSON repo on github, i understand how it is used.
 * JSON is predefined within the SLACKBOT to hold data values within it's Web Server
 * By creating values within our bot, we can request values from the WebServer and identify
 * them within our JAVA.
 *
 * Created by Hyun on 9/11/16.
 */
public class Field {

    private String title;
    private String value;
    private boolean isShort;

    // create a new constructor below:
    public Field(JSONObject json){
        if ( json.containsKey("title")){
            this.title = (String) json.get ("title");
        }
        if (json.containsKey("title")){
            this.value = (String) json.get ("value");

        }
        if( json.containsKey("title")){
            this.isShort = (boolean) json.get (isShort);

        }
    }

    public String getTitle() {
        return title;
    }

    public String getValue() {
        return value;
    }

    public boolean isShort() {
        return isShort;
    }



}
