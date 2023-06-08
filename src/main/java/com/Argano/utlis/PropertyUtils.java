package com.Argano.utlis;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.Argano.constants.FrameworkConstants;
import com.Argano.enums.ConfigProperties;
import com.Argano.exception.PropertyFileHandlingException;

public final class PropertyUtils {

	private PropertyUtils() {

	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();

	// using static block to avoid calling of file and loading it every time we we
	// try to read a property value
	// property file internally stores values in hashtable. we can convert them to
	// hashmap and use it as hashmap are bit faster than hashtable

	static {
		try (FileInputStream fil = new FileInputStream(FrameworkConstants.getConfigFilePath())) {
			property.load(fil);
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}
			
		} catch (IOException e1) {

			e1.printStackTrace();
			System.exit(0);
		}

	}

	public static String get(ConfigProperties key) {
		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
			throw new PropertyFileHandlingException(
					"Property name " + key + " not found. Please check config.properties");
		}
		return CONFIGMAP.get(key.name().toLowerCase());

	}
}

/*
 * public static String getValue(String key) throws Exception {
 * if(Objects.isNull(property.getProperty(key))|| Objects.isNull(key)) { throw
 * new Exception("Property name " + key +
 * " not found. Please check config.properties"); } return
 * property.getProperty(key); }
 */
