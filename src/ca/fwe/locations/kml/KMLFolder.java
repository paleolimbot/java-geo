package ca.fwe.locations.kml;

import java.util.ArrayList;

public class KMLFolder extends KMLEncloser {

	public KMLFolder(String name, String description, ArrayList<Placemark> contents) {
		super("Folder", name, description, contents);
	}

}
