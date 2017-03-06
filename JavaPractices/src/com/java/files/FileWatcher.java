package com.java.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class FileWatcher {
	public static void main(String args[]) throws IOException, InterruptedException{
		final Path path = FileSystems.getDefault().getPath("E:\\Abhi\\TestingApps\\Java\\PubSubDataProvider\\News");
		System.out.println(path);
		try (final WatchService watchService = FileSystems.getDefault().newWatchService()) {
		    final WatchKey watchKey = path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
		    while (true) {
		        final WatchKey wk = watchService.take();
		        for (WatchEvent<?> event : wk.pollEvents()) {
		            //we only register "ENTRY_MODIFY" so the context is always a Path.
		            final Path changed = (Path) event.context();
		            System.out.println(changed);
    		        }
		        // reset the key
		        boolean valid = wk.reset();
		        if (!valid) {
		            System.out.println("Key has been unregisterede");
		        }
		    }
		}
	}
}
