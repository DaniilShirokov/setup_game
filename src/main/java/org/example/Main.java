package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static StringBuffer infoAboutDownload = new StringBuffer("");

    public static void main(String[] args) throws IOException {
        List<String> listFolder = new ArrayList<>();
        listFolder.add("F:\\Work\\JavaNetology\\Games\\src");
        listFolder.add("F:\\Work\\JavaNetology\\Games\\src\\main");
        listFolder.add("F:\\Work\\JavaNetology\\Games\\src\\test");
        listFolder.add("F:\\Work\\JavaNetology\\Games\\savegames");
        listFolder.add("F:\\Work\\JavaNetology\\Games\\res");
        listFolder.add("F:\\Work\\JavaNetology\\Games\\res\\drawables");
        listFolder.add("F:\\Work\\JavaNetology\\Games\\res\\vectors");
        listFolder.add("F:\\Work\\JavaNetology\\Games\\res\\icons");
        listFolder.add("F:\\Work\\JavaNetology\\Games\\temp");

        List<String> listFile = new ArrayList<>();
        listFile.add("Main.java");
        listFile.add("Utils.java");

        File srcMainFolder = new File("F:\\Work\\JavaNetology\\Games\\src\\main");

        for (String folder : listFolder) {
            createFolder(folder);
        }

        for (String file : listFile) {
            createFile(srcMainFolder, file);
        }
        createLogFile();

    }

    public static void createFolder(String filePath) {
        File folder = new File(filePath);
        if (folder.mkdir())
            createLogRecord(folder);
    }

    public static void createFile(File file, String fileName) throws IOException {
        File newFile = new File(file.getPath(), fileName);
        if (newFile.createNewFile())
            createLogRecord(newFile);
        createLogRecord(newFile);
    }

    public static void createLogRecord(File file) {
        infoAboutDownload.append(file.getName() + " создан в " + file.getPath() + "\n");
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