package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer infoAboutDownload = new StringBuffer("");
        File src = new File("F:\\Work\\JavaNetology\\Games\\src");
        File srcMain = new File("F:\\Work\\JavaNetology\\Games\\src\\main");
        File srcMainMain = new File("F:\\Work\\JavaNetology\\Games\\src\\main",  "Main.java");
        File srcMainUtils = new File("F:\\Work\\JavaNetology\\Games\\src\\main",  "Utils.java");
        File srcTest = new File("F:\\Work\\JavaNetology\\Games\\src\\test");
        File savegames = new File("F:\\Work\\JavaNetology\\Games\\savegames");
        File res = new File("F:\\Work\\JavaNetology\\Games\\res");
        File resDrawables = new File("F:\\Work\\JavaNetology\\Games\\res\\drawables");
        File resVectors = new File("F:\\Work\\JavaNetology\\Games\\res\\vectors");
        File resIcons = new File("F:\\Work\\JavaNetology\\Games\\res\\icons");
        File temp = new File("F:\\Work\\JavaNetology\\Games\\temp");
        //File tempTxt = new File("F:\\Work\\JavaNetology\\Games\\temp", "temp.txt");
        try {
            if (src.mkdir()) {
                infoAboutDownload.append("Папка src создана \n");
                if (srcMain.mkdir())
                    infoAboutDownload.append("Папка main в директории src создана \n");
                    if (srcMainMain.createNewFile())
                        infoAboutDownload.append("Файл Main.java в директории src\\main создан \n");
                    if (srcMainUtils.createNewFile())
                        infoAboutDownload.append("Файл Utils.java в директории src\\main создан \n");
                if (srcTest.mkdir())
                    infoAboutDownload.append("Папка test в директории src создана \n");
            }

            if (savegames.mkdir())
                infoAboutDownload.append("Папка savegames создана \n");
            if (res.mkdir()) {
                infoAboutDownload.append("Папка res создана \n");
                if (resDrawables.mkdir())
                    infoAboutDownload.append("Папка drawables в директории res создана \n");
                if (resVectors.mkdir())
                    infoAboutDownload.append("Папка vectors в директории res создана \n");
                if (resIcons.mkdir())
                    infoAboutDownload.append("Папка icons в директории res создана \n");

            }
            if (temp.mkdir())
                infoAboutDownload.append("Папка temp создана \n");


            FileWriter writer = new FileWriter("F:\\Work\\JavaNetology\\Games\\temp\\temp.txt");
            writer.write(infoAboutDownload.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }
}