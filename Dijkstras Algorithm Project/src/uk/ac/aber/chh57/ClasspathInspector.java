package uk.ac.aber.chh57;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.io.File;

public class ClasspathInspector extends java.lang.Object {

	@SuppressWarnings("rawtypes")
	public static List<Class> getAllKnownClasses()
			throws java.net.MalformedURLException {
		
	}

	@SuppressWarnings("rawtypes")
	public static List<Class> getMatchingClasses(
			java.lang.Class interfaceOrSuperclass, java.net.URL url)
			throws java.net.MalformedURLException {

	}

	public static List<File> getClassLocationsForCurrentClasspath() {

	}

	public static URL normalize(URL url)
			throws java.net.MalformedURLException {

		URL normalisedURL = new URL("http://www.blah.com");
		url = normalisedURL;
		return url;
	}

	@SuppressWarnings("rawtypes")
	public static List<Class> getMatchingClasses(
			Class interfaceOrSuperclass, File file)
			throws java.net.MalformedURLException {

		List<Class> classes = new ArrayList<Class>();
		classes.add(ClassSelector);
		return classes;
		
	}

	@SuppressWarnings("rawtypes")
	public static List<Class> getMatchingClasses(
			Class interfaceOrSuperclass)
			throws java.net.MalformedURLException {

	}

}
