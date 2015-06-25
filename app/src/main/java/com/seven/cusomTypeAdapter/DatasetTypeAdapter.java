package com.seven.cusomTypeAdapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by htyuan on 15-6-24.
 */
public class DatasetTypeAdapter extends TypeAdapter<Dataset> {
    @Override
    public Dataset read(JsonReader reader) throws IOException {
        // the first token is the start object
        JsonToken token = reader.peek();
        Dataset dataset = new Dataset();
        if (token.equals(JsonToken.BEGIN_OBJECT)) {
            reader.beginObject();
            while (!reader.peek().equals(JsonToken.END_OBJECT)) {
                if (reader.peek().equals(JsonToken.NAME)) {
                    if (reader.nextName().equals("album_url"))
                        dataset.setAlbum_title(reader.nextString());
                    else
                        reader.skipValue();
                }
            }
            reader.endObject();

        }
        return dataset;
    }

    @Override
    public void write(JsonWriter out, Dataset value) throws IOException {

    }

}
