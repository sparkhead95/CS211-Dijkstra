package uk.ac.aber.chh57;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.io.File;

public class ClassPathInspector extends java.lang.Object {

	public ClassPathInspector() {
	}
	
	// Returns a list of all the known classes in the program
	@SuppressWarnings("rawtypes")
	public static List<Class> getAllKnownClasses()
			throws java.net.MalformedURLException {
		
	}

	// Returns a list of classes that match the params- for interface/superclass and URL
	@SuppressWarnings("rawtypes")
	public static List<Class> getMatchingClasses(
			Class interfaceOrSuperclass, URL url)
			throws java.net.MalformedURLException {

	}

	// Returns a list of files (where locations can be found from them) for the current class path
	public static List<File> getClassLocationsForCurrentClasspath() {

	}
	
	// Returns a normalised URL
	public static URL normalize(URL url)
			throws java.net.MalformedURLException {

		URL normalisedURL = new URL("http://www.blah.com");
		url = normalisedURL;
		return url;
	}

	// Returns a list of classes that match the params- for interface/superclass and file(location of file)
	@SuppressWarnings("rawtypes")
	public static List<Class> getMatchingClasses(
			Class interfaceOrSuperclass, File file)
			throws java.net.MalformedURLException {

		List<Class> classes = new ArrayList<Class>();
		return classes;
	}

	// Returns a list of classes that match the params- for interface/superclass
	@SuppressWarnings("rawtypes")
	public static List<Class> getMatchingClasses(
			Class interfaceOrSuperclass)
			throws java.net.MalformedURLException {

	}

}
