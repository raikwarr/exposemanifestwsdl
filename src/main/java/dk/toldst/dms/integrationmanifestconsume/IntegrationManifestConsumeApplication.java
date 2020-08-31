package dk.toldst.dms.integrationmanifestconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.ws.config.annotation.EnableWs;

@IntegrationComponentScan
@EnableWs
@SpringBootApplication
public class IntegrationManifestConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationManifestConsumeApplication.class, args);
	}

}
