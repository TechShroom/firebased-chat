package com.techshroom.fxml;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public final class FXMLLoader2 {
    private static String resourcePath = "./";

    public static void setResourcePath(String resourcePath) {
        FXMLLoader2.resourcePath = resourcePath;
    }

    public static String getResourcePath() {
        return resourcePath;
    }

    private FXMLLoader2() {
    }

    public static Parent load(Path source) {
        try {
            return FXMLLoader.load(source.toUri().toURL());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Load relative to the resource path.
     * 
     * @param resPath
     * @return
     */
    public static Parent load(String resPath) {
        return load(Paths.get(resourcePath, resPath));
    }
}
