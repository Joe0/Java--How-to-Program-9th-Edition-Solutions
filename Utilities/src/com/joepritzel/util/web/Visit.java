package com.joepritzel.util.web;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Visit {

	/**
	 * Gets the raw data on the page using the specified user-agent.
	 * 
	 * @param url
	 * @param agent
	 * @return
	 * @throws IOException
	 */
	public static String getRaw(URL url, String agent) throws IOException {
		HttpURLConnection uc = (HttpURLConnection) url.openConnection();
		if (agent != null) {
			uc.setRequestProperty("User-Agent", agent);
		}
		uc.setDoInput(true);
		InputStreamReader in = new InputStreamReader(uc.getInputStream());
		StringBuilder sb = new StringBuilder();
		int c;
		try {
			while ((c = in.read()) != -1) {
				sb.append((char) c);
			}
		} finally {
			in.close();
		}
		return sb.toString();
	}

	/**
	 * Gets the raw data on the given page.
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String getRaw(URL url) throws IOException {
		return getRaw(url, null);
	}
}
