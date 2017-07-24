package io.prometheus.wls.rest;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.prometheus.wls.rest.domain.ExporterConfig;
import io.prometheus.wls.rest.domain.MBeanSelector;
import io.prometheus.wls.rest.domain.MetricsScraper;

import java.io.StringReader;
import java.util.Map;

public class YamlDemo {

    @SuppressWarnings("unchecked")
    public static void main(String... args) throws Exception {
        String yamlString = DemoInputs.YAML_STRING2;
        System.out.println("The following configuration:\n" + yamlString);
        ExporterConfig exporterConfig = ExporterConfig.loadConfig(new StringReader(yamlString));

        System.out.println("Generates the query:");
        MBeanSelector selector = exporterConfig.getQueries()[0];
        System.out.println(selector.getPrintableRequest());

        System.out.println();
        System.out.println("The response\n" + DemoInputs.RESPONSE + "\nwill be transformed into the following metrics:");

        MetricsScraper scraper = new MetricsScraper();
        scraper.scrape(selector, getJsonResponse(DemoInputs.RESPONSE));

        for (Map.Entry<String,Object> entry : scraper.getMetrics().entrySet())
            System.out.printf("  %s %s%n", entry.getKey(), entry.getValue());

    }

    private static JsonObject getJsonResponse(String jsonString) {
        return new JsonParser().parse(jsonString).getAsJsonObject();
    }

}
