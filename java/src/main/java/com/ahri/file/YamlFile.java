package com.ahri.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class YamlFile {
    private final Path yaml_file = Paths.get(System.getenv("SOKYOEI_DATA_DIR") + "/Ahri/Ahri.yaml").toAbsolutePath();

    public static void main(String[] args) {

    }
}
