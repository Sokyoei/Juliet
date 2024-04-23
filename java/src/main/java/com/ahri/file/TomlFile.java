package com.ahri.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TomlFile {
    public static void main(String[] args) {
        Path toml_file = Paths.get(System.getProperty("user.dir") + "/data/Ahri/Ahri.toml").toAbsolutePath();

    }
}
