package org.ieti.lucrarea6;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtility {

	public static void  writeToFile(SubscriptionPlan plan)
	{
		XmlMapper xmlMapper=new XmlMapper();
		ObjectWriter writer= xmlMapper.writer();

		File file=new File("src/main/resources/plan.xml");

		try {
			writer.writeValue(file,plan);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SubscriptionPlan readFromFile() {

		XmlMapper xmlMapper = new XmlMapper();

		try {

			String xml = new String(Files.readAllBytes(Paths.get("src/main/resources/plan.xml")));
			SubscriptionPlan subscriptionPlan = xmlMapper.readValue(xml, SubscriptionPlan.class);
			return subscriptionPlan;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
