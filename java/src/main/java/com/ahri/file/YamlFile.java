package com.ahri.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.yaml.snakeyaml.Yaml;

public class YamlFile {
    private final static Path yaml_file = Paths.get(System.getenv("SOKYOEI_DATA_DIR") + "/Ahri/Ahri.yaml")
                                               .toAbsolutePath();

    public static void main(String[] args) {
        try {
            Yaml yaml = new Yaml();
            Object data = yaml.load(new FileInputStream(yaml_file.toString()));
            printYamlData(data, 0);
        } catch (FileNotFoundException e) {
            System.err.println(yaml_file.toString() + " not found.");
        } catch (Exception e) {
            System.err.println("Error parsing YAML file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * @brief 打印YAML数据结构
     * @param data
     * @param indent
     */
    private static void printYamlData(Object data, int indent) {
        if (data == null) {
            System.out.println(getIndent(indent) + "null");
            return;
        }

        if (data instanceof Map) {
            @SuppressWarnings("unchecked") Map<String, Object> map = (Map<String, Object>) data;
            Set<Map.Entry<String, Object>> entries = map.entrySet();

            for (Map.Entry<String, Object> entry : entries) {
                String key = entry.getKey();
                Object value = entry.getValue();

                System.out.println(getIndent(indent) + key + ":");
                printYamlData(value, indent + 2);
            }
        } else if (data instanceof List) {
            @SuppressWarnings("unchecked") List<Object> list = (List<Object>) data;

            for (int i = 0; i < list.size(); i++) {
                Object item = list.get(i);
                System.out.println(getIndent(indent) + "- ");
                printYamlData(item, indent + 2);
            }
        } else {
            // 基本数据类型
            System.out.println(getIndent(indent) + data.toString());
        }
    }

    /**
     * @brief 生成缩进字符串
     * @param indent
     * @return
     */
    private static String getIndent(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
