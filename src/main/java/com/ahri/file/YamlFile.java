package com.ahri.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class YamlFile {
    public static void main(String[] args) {
        Path yaml_file = Paths.get(System.getProperty("user.dir") + "/data/Ahri/Ahri.yaml").toAbsolutePath();

    }
}
