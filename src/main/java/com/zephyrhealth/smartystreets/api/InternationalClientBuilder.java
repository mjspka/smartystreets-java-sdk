/**
 *
 */
package com.zephyrhealth.smartystreets.api;

import com.smartystreets.api.GoogleSerializer;
import com.smartystreets.api.Serializer;
import com.smartystreets.api.StaticCredentials;
import com.smartystreets.api.us_street.ClientBuilder;

/**
 * @author pmalla
 *
 */
public class InternationalClientBuilder extends ClientBuilder {
	private String urlPrefix;
	private Serializer serializer;

	public InternationalClientBuilder() {
		init();
	}

	public InternationalClientBuilder(String authId, String authToken) {
		super(new StaticCredentials(authId, authToken));
		init();
	}

	private void init() {
		this.serializer = new GoogleSerializer();
		this.urlPrefix = "https://international-street.api.smartystreets.com/verify";
	}

	public InternationalClient buildInternationalClient() {
		return new InternationalClient(this.urlPrefix, super.buildSender(), this.serializer);
	}
}
