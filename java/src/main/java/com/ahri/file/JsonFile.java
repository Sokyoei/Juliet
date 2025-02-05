package com.ahri.file;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonFile {
    private final Path json_file = Paths.get(System.getenv("SOKYOEI_DATA_DIR") + "/Ahri/Ahri.json").toAbsolutePath();

    void orgJson() throws FileNotFoundException {
        JSONTokener jsonTokener = new JSONTokener(new FileReader(json_file.toString()));
        JSONObject jsonObject = (JSONObject) jsonTokener.nextValue();
        System.out.println(jsonObject);
    }

    void fastJson() throws IOException {
        String json_file_str = FileUtils.readFileToString(new File(json_file.toString()), "utf8");
        com.alibaba.fastjson.JSONObject jsonObject = (com.alibaba.fastjson.JSONObject) JSON.parse(json_file_str);
        System.out.println(jsonObject);
    }

    public static void main(String[] args) throws IOException {
        JsonFile jsonFile = new JsonFile();
        jsonFile.orgJson();
        jsonFile.fastJson();
    }
}
