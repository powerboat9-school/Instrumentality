package com.powerboat9.instrument;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FolderFSManager man = new FolderFSManager(new File(args[1]).toPath());
        while (man.update());
    }
}
