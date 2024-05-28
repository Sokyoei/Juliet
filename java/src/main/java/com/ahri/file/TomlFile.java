package com.ahri.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TomlFile {
    private final Path toml_file = Paths.get(System.getProperty("user.dir") + "/data/Ahri/Ahri.toml").toAbsolutePath();

    public static void main(String[] args) {

    }
}
