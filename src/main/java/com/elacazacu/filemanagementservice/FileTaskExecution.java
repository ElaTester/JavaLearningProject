package com.elacazacu.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File demoFile = new File("src/main/java/com/elacazacu/filemanagementservice/test.txt");

        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printIfTHeFileIsADirectory(demoFile);
        FileManager.printTheTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
        FileManager.deleteTheFileIfExists(demoFile);

        InputFileReadManager.readDataFromATextFile(demoFile);
        InputFileReadManager.readDataFromATextFileUsingFileReader(demoFile);
        System.out.println();
        InputFileReadManager.readDataFromATextFileUsingBufferedReader(demoFile);

        String contentForTheFile = "New Content for big bosses \n another line";
        OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile, contentForTheFile);
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Text for you");

        InputFileReadManager.readDataFromATextFile(demoFile);
    }
}
