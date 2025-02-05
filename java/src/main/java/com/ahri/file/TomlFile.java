package com.ahri.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TomlFile {
    private final Path toml_file = Paths.get(System.getenv("SOKYOEI_DATA_DIR") + "/Ahri/Ahri.toml").toAbsolutePath();

    public static void main(String[] args) {

    }
}
