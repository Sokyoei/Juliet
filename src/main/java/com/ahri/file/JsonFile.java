package com.ahri.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonFile {
    public static void main(String[] args) {
        Path json_file = Paths.get(System.getProperty("user.dir") + "/data/Ahri/Ahri.json").toAbsolutePath();

    }
}
