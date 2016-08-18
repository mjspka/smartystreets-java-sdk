/**
 *
 */
package examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.smartystreets.api.exceptions.BatchFullException;
import com.smartystreets.api.exceptions.SmartyException;
import com.zephyrhealth.smartystreets.InternationalLookup;
import com.zephyrhealth.smartystreets.api.InternationalBatch;
import com.zephyrhealth.smartystreets.api.InternationalCandidate;
import com.zephyrhealth.smartystreets.api.InternationalClient;
import com.zephyrhealth.smartystreets.api.InternationalClientBuilder;
import com.zephyrhealth.smartystreets.api.InternationalComponent;
import com.zephyrhealth.smartystreets.api.InternationalMetadata;

/**
 * @author pmalla
 *
 */
public class SmartyStreetsApi {
	private static final Logger LOGGER = LogManager.getLogManager().getLogger(SmartyStreetsApi.class.getName());
	private InternationalClient client;

	public static void main(String[] args) throws Exception {
		SmartyStreetsApi smartyStreetsApi = new SmartyStreetsApi();
		smartyStreetsApi.client = new InternationalClientBuilder("Your Auth ID",
				"Your Auth Token").buildInternationalClient();
		smartyStreetsApi.findStandardAddressBySmartyStreets();
	}

	/**
	 * The purpose of this method is to find the standard address by talking to maps api by google.
	 *
	 * @param rawAddressList
	 *            list of raw addresses. Please remember to set id attribute of rawAddress.
	 * @param requestStandardizedOnly
	 *            true if smartystreets has to return standardized addresses only otherwise false
	 * @return map of standard address
	 * @throws Exception
	 *             if error
	 */
	public void findStandardAddressBySmartyStreets()
			throws Exception {

		// Construct batch input for smartystreets api
		InternationalBatch batch = new InternationalBatch();

		InternationalLookup lookupAddress = new InternationalLookup();
		lookupAddress.setInputId("123");
		lookupAddress.setLocality("Paris");
		lookupAddress.setCountry("France");
		batch.add(lookupAddress);

		// Submit batch input to smartystreets server
		try {
			client.send(batch);
		} catch (BatchFullException ex) {
			System.out.println("Oops! Batch was already full. Please retry after some time.");
			throw new Exception(ex);
		} catch (SmartyException | IOException ex) {
			System.out.println(ex.getMessage());
			throw new Exception(ex);
		}

		Map<String, InternationalLookup> namedLookups = batch.getNamedLookups();
		// Loop through the results
		for (String key : namedLookups.keySet()) {
			InternationalLookup lookup = namedLookups.get(key);

			ArrayList<InternationalCandidate> candidates = lookup.getResult();

			if (candidates.isEmpty()) {
				System.out.println("Address with key, " + key + " is invalid.\n");
				continue;
			}

			System.out.println("Address with key, " + key + " is valid. (There is at least one candidate)");

			// Construct list of addresses from the maps-api results
			for (InternationalCandidate candidate : candidates) {
				final InternationalComponent components = candidate.getComponents();
				final InternationalMetadata metadata = candidate.getMetadata();

				System.out.println(candidate.getOrganization());
				System.out.println(candidate.getAddress1());
				System.out.println(candidate.getAddress2());
				System.out.println(components.getLocality());
				System.out.println(components.getAdministrativeArea());
				System.out.println(components.getPostalCode());
				System.out.println(metadata.getLongitude());
				System.out.println(metadata.getLatitude());
				System.out.println(metadata.getGeocodePrecision());
				System.out.println(components.hashCode());
				System.out.println(components.getCountryIso3());
			}

		}

		return;
	}

}
