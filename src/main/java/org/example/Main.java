package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static StringBuffer infoAboutDownload = new StringBuffer("");
    public static void main(String[] args) throws IOException {
        List<String> listFile = new ArrayList<>();
        listFile.add("F:\\Work\\JavaNetology\\Games\\src");
        listFile.add("F:\\Work\\JavaNetology\\Games\\src\\main");
        listFile.add("F:\\Work\\JavaNetology\\Games\\src\\main\\Main.java");
        listFile.add("F:\\Work\\JavaNetology\\Games\\src\\main\\Utils.java");
        listFile.add("F:\\Work\\JavaNetology\\Games\\src\\test");
        listFile.add("F:\\Work\\JavaNetology\\Games\\savegames");
        listFile.add("F:\\Work\\JavaNetology\\Games\\res");
        listFile.add("F:\\Work\\JavaNetology\\Games\\res\\drawables");
        listFile.add("F:\\Work\\JavaNetology\\Games\\res\\vectors");
        listFile.add("F:\\Work\\JavaNetology\\Games\\res\\icons");
        listFile.add("F:\\Work\\JavaNetology\\Games\\temp");

        for (String file : listFile) {
            createFile(file);
        }
        createLogFile();
    }

    public static void createFile(String filePath) {
        File file = new File(filePath);
        if (file.mkdir())
            createLogRecord(file);
    }

    public static void createLogRecord (File file) {
        infoAboutDownload.append( file.getName() + " создан в " + file.getPath() + "\n");
    }

    public static void createLogFile() {
        try {
            FileWriter writer = new FileWriter("F:\\Work\\JavaNetology\\Games\\temp\\temp.txt");
            writer.write(infoAboutDownload.toString());
            writer.close();
        } catch (IOException e) {
              System.out.println("Ошибка при записи в файл");
               e.printStackTrace();
        }
    }
}