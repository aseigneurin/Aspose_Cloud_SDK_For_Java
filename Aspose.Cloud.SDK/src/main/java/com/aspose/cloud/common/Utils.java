/**
 * 
 */
package com.aspose.cloud.common;

import groovyx.net.http.URIBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

/**
 * @author Mudassir
 * 
 */
public class Utils {

	private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

	/**
	 * Computes RFC 2104-compliant HMAC signature. * @param data The data to be
	 * signed.
	 * 
	 * @param key
	 *            The signing key.
	 * @return The Base64-encoded RFC 2104-compliant HMAC signature.
	 * @throws java.security.SignatureException
	 *             when signature generation fails
	 */
	public static String Sign(String data) {
		try {

			data = data.replace(" ", "%20");

			Map<String, String> query = new HashMap<String, String>(1); // UriBuilder
																		// builder=new
																		// UriBuilder();
			query.put("appSID", com.aspose.cloud.common.AsposeApp.getAppSID());

			URIBuilder uri = new URIBuilder(data);
			// uri.setPort(80);

			String url = uri.toURI().getPath();
			url = url.replace(" ", "%20");
			uri.setPath(url);
			uri.addQueryParams(query);

			url = uri.toURI().getPath();
			// String url=uri.toURI ().getPath ();
			// Remove final slash here as it can be added automatically.
			if (url.charAt(url.length() - 1) == '/') {
				String tempUrl = url.substring(0, url.length() - 1);
				uri.setPath(tempUrl);
			}
			url = uri.toURI().toString();
      url = url.replace("%2C", ",");

			// get an hmac_sha1 key from the raw key bytes
			SecretKeySpec signingKey = new SecretKeySpec(AsposeApp
					.getAppKey().getBytes(), HMAC_SHA1_ALGORITHM);

			// get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
			mac.init(signingKey);

			// compute the hmac on input data bytes
			byte[] rawHmac = mac.doFinal(url.getBytes());
			byte newresult[] = Base64.encodeBase64(rawHmac);

			// Remove invalid symbols.
			String result = new String(newresult);
			result = result.substring(0, result.length() - 1);

			String encodedUrl = URLEncoder.encode(result, "UTF-8");
			// System.out.println("Final URL:" + uri.toURI().toString
			// ()+"&signature="+encodedUrl);
			return uri.toURI().toString() + "&signature=" + encodedUrl;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}

	public static String Sign(String data, String AppKey, String AppSID) {
		try {

			data = data.replace(" ", "%20");

			Map<String, String> query = new HashMap<String, String>(1); // UriBuilder
																		// builder=new
																		// UriBuilder();
			query.put("appSID", AppSID);

			URIBuilder uri = new URIBuilder(data);
			// uri.setPort(80);

			String url = uri.toURI().getPath();
			url = url.replace(" ", "%20");
			uri.setPath(url);
			uri.addQueryParams(query);

			url = uri.toURI().getPath();
			// String url=uri.toURI ().getPath ();
			// Remove final slash here as it can be added automatically.
			if (url.charAt(url.length() - 1) == '/') {
				String tempUrl = url.substring(0, url.length() - 1);
				uri.setPath(tempUrl);
			}
			url = uri.toURI().toString();
      url = url.replace("%2C", ",");

			// get an hmac_sha1 key from the raw key bytes
			SecretKeySpec signingKey = new SecretKeySpec(AppKey.getBytes(),
					HMAC_SHA1_ALGORITHM);

			// get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
			mac.init(signingKey);

			// compute the hmac on input data bytes
			byte[] rawHmac = mac.doFinal(url.getBytes());
			byte newresult[] = Base64.encodeBase64(rawHmac);

			// Remove invalid symbols.
			String result = new String(newresult);
			result = result.substring(0, result.length() - 1);

			String encodedUrl = URLEncoder.encode(result, "UTF-8");
			// System.out.println("Final URL:" + uri.toURI().toString
			// ()+"&signature="+encodedUrl);
			return uri.toURI().toString() + "&signature=" + encodedUrl;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}

	public static String UploadFileBinary(File localFile, String uploadUrl,
			String strHttpCommand) {
		try {
			URL url = new URL(uploadUrl);
			byte[] buf = getBytesFromFile(localFile);
			HttpURLConnection m_connection;
			m_connection = (HttpURLConnection) url.openConnection();
			//String parameters = "data=some_post_data";
			m_connection.setDoOutput(true);
			m_connection.setRequestMethod("PUT");
			m_connection.setRequestProperty("Accept", "text/json");
			m_connection.setRequestProperty("Content-Type",
					"MultiPart/Form-Data");
			//byte bytes[] = parameters.getBytes();
			m_connection.setRequestProperty("Content-length", "" + buf.length);
			m_connection.connect();
			java.io.OutputStream out = m_connection.getOutputStream();
			out.write(buf);
			out.flush();

			InputStream response = m_connection.getInputStream();

			String res = StreamToString(response);

			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	// Returns the contents of the file in a byte array.
	public static byte[] getBytesFromFile(File file) throws IOException {
		InputStream is = new FileInputStream(file);

		// Get the size of the file
		long length = file.length();

		// You cannot create an array using a long type.
		// It needs to be an int type.
		// Before converting to an int type, check
		// to ensure that file is not larger than Integer.MAX_VALUE.
		if (length > Integer.MAX_VALUE) {
			// File is too large
		}

		// Create the byte array to hold the data
		byte[] bytes = new byte[(int) length];

		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}

		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			throw new IOException("Could not completely read file "	+ file.getName());
		}

		// Close the input stream and return bytes
		is.close();
		return bytes;
	}

	public static InputStream ProcessCommand(String strURI,
			String strHttpCommand, String strContent) {
		
		URL address = null;
		HttpURLConnection httpCon = null;

		try {
			address = new URL(strURI);
			httpCon = (HttpURLConnection) address
					.openConnection();
			httpCon.setDoOutput(true);
			httpCon.setRequestProperty("Content-Type", "application/json");
			httpCon.setRequestProperty("Accept", "text/json");
			httpCon.setRequestMethod(strHttpCommand);
			httpCon.setFixedLengthStreamingMode(strContent.length());
			OutputStreamWriter out = new OutputStreamWriter(
					httpCon.getOutputStream());
			out.write(strContent);
			out.close();

			return httpCon.getInputStream();
		} catch (Exception Ex) {
			InputStream error = httpCon.getErrorStream();
			String s = Utils.StreamToString(error);
			System.out.println(s);
			Ex.printStackTrace();
			return null;
		}

	}

	public static InputStream ProcessCommand(String strURI,
			String strHttpCommand, InputStream strContent) {
		
		URL address = null;
		HttpURLConnection httpCon = null;
		
		try {
			byte[] bytes = IOUtils.toByteArray(strContent);
			address = new URL(strURI);
			httpCon = (HttpURLConnection) address
					.openConnection();
			httpCon.setDoOutput(true);

			httpCon.setRequestProperty("Content-Type", "multipart/form-data");// "application/x-www-form-urlencoded"
																				// );
			httpCon.setRequestMethod(strHttpCommand);

			httpCon.setFixedLengthStreamingMode(bytes.length);

			java.io.OutputStream out = httpCon.getOutputStream();
			out.write(bytes);
			out.flush();

			return httpCon.getInputStream();
		} catch (Exception Ex) {
			InputStream error = httpCon.getErrorStream();
			String s = Utils.StreamToString(error);
			System.out.println(s);
			
			Ex.printStackTrace();
			return null;
		}

	}

	public static InputStream ProcessCommand(String strURI,
			String strHttpCommand)  {
		
		URL address = null;
		HttpURLConnection httpCon = null;
		
		try{
			address = new URL(strURI);
			httpCon = (HttpURLConnection) address
					.openConnection();
			httpCon.setDoOutput(true);
			httpCon.setRequestProperty("Content-Type", "application/json");
			httpCon.setRequestProperty("Accept", "text/json");
			httpCon.setRequestMethod(strHttpCommand);
			if (strHttpCommand.equals("PUT") || strHttpCommand.equals("POST"))
				httpCon.setFixedLengthStreamingMode(0);
			
			return httpCon.getInputStream();
			
		} catch (Exception ex) {
			InputStream error = httpCon.getErrorStream();
			String s = Utils.StreamToString(error);
			System.out.println(s);
			
			ex.printStackTrace();
			return null;
		}

		

	}

	public static InputStream ProcessCommand(String strURI,
			String strHttpCommand, String strContent, String ContentType) {
		
		URL address = null;
		HttpURLConnection httpCon = null;
		
		try {

			byte[] arr = strContent.getBytes();

			address = new URL(strURI);
			httpCon = (HttpURLConnection) address
					.openConnection();
			httpCon.setDoOutput(true);

			if (ContentType.toLowerCase() == "xml")
				httpCon.setRequestProperty("Content-Type", "application/xml");
			else
				httpCon.setRequestProperty("Content-Type", "application/json");

			httpCon.setRequestMethod(strHttpCommand);

			httpCon.setFixedLengthStreamingMode(arr.length);

			java.io.OutputStream out = httpCon.getOutputStream();
			out.write(arr);
			out.flush();			

			return httpCon.getInputStream();
		} catch (Exception Ex) {
			InputStream error = httpCon.getErrorStream();
			String s = Utils.StreamToString(error);
			System.out.println(s);
			
			Ex.printStackTrace();
			return null;
		}
	}

	public static String StreamToString(InputStream stream) {
		try {
			// read it with BufferedReader
			java.io.BufferedReader br = new java.io.BufferedReader(
					new java.io.InputStreamReader(stream));

			StringBuilder sb = new StringBuilder();

			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

			// System.out.println(sb.toString());

			br.close();
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
