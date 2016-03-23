package com.appweava.redditrx.data;

import com.appweava.redditrx.data.entities.SubredditResult;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by weava on 3/22/16.
 */
public class SubredditDeserializer implements JsonDeserializer<SubredditResult> {

    @Override
    public SubredditResult deserialize(JsonElement json, Type typeOfT,
                                       JsonDeserializationContext context) throws JsonParseException {

        JsonObject fullJson = json.getAsJsonObject();
        JsonElement listings =  fullJson.getAsJsonObject("data");

        return new Gson().fromJson(listings, SubredditResult.class);
    }
}
