package io.prometheus.wls.rest;

class DemoInputs {
    static final String YAML_STRING = "---\n" +
            "startDelaySeconds: 5\n" +
            "host: localhost\n" +
            "port: 7001\n" +
            "username: system\n" +
            "password: gumby1234\n" +
            "\n" +
            "queries:\n" +
            "- serverRuntimes:\n" +
            "    key: name\n" +
            "    keyName: location\n" +
            "    applicationRuntimes:\n" +
            "      key: name\n" +
            "      keyName: application\n" +
            "      componentRuntimes:\n" +
            "        type: WebAppComponentRuntime\n" +
            "        prefix: webapp_config_\n" +
            "        key: name\n" +
            "        values: [deploymentState, type, contextRoot, sourceInfo, openSessionsHighCount, openSessionsCurrentCount, sessionsOpenedTotalCount]\n" +
            "        servlets:\n" +
            "          prefix: weblogic_servlet_\n" +
            "          key: servletName\n" +
            "          values: invocationTotalCount\n";

    static final String YAML_STRING2 = "---\n" +
            "startDelaySeconds: 5\n" +
            "host: localhost\n" +
            "port: 7001\n" +
            "username: system\n" +
            "password: gumby1234\n" +
            "queries:\n" +
            "- applicationRuntimes:\n" +
            "    key: name\n" +
            "    keyName: app\n" +
            "    componentRuntimes:\n" +
            "      type: WebAppComponentRuntime\n" +
            "      prefix: webapp_config_\n" +
            "      key: name\n" +
            "      values: [deploymentState, type, contextRoot, sourceInfo, openSessionsHighCount, openSessionsCurrentCount, sessionsOpenedTotalCount]\n" +
            "      servlets:\n" +
            "        prefix: weblogic_servlet_\n" +
            "        key: servletName\n" +
            "        values: invocationTotalCount\n";

    static final String RESPONSE =
                    "{\"serverRuntimes\": {\"items\": [{\n" +
                    "    \"name\": \"ejb30mtflexadmin\",\n" +
                    "    \"applicationRuntimes\": {\"items\": [\n" +
                    "        {\n" +
                    "            \"internal\": false,\n" +
                    "            \"name\": \"mbeans\",\n" +
                    "            \"componentRuntimes\": {\"items\": [{\n" +
                    "                \"deploymentState\": 2,\n" +
                    "                \"name\": \"EjbStatusBean\",\n" +
                    "                \"type\": \"EJBComponentRuntime\"\n" +
                    "              }]}\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"internal\": true,\n" +
                    "            \"name\": \"weblogic\",\n" +
                    "            \"componentRuntimes\": {\"items\": [{\n" +
                    "                \"type\": \"WebAppComponentRuntime\",\n" +
                    "                \"sourceInfo\": \"weblogic.war\",\n" +
                    "                \"contextRoot\": \"\\/weblogic\",\n" +
                    "                \"openSessionsCurrentCount\": 4,\n" +
                    "                \"deploymentState\": 2,\n" +
                    "                \"sessionsOpenedTotalCount\": 50,\n" +
                    "                \"name\": \"ejb30_weblogic\",\n" +
                    "                \"openSessionsHighCount\": 25,\n" +
                    "                \"servlets\": {\"items\": [\n" +
                    "                    {\n" +
                    "                        \"servletName\": \"JspServlet\",\n" +
                    "                        \"invocationTotalCount\": 0\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"servletName\": \"FileServlet\",\n" +
                    "                        \"invocationTotalCount\": 1\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"servletName\": \"ready\",\n" +
                    "                        \"invocationTotalCount\": 2\n" +
                    "                    }\n" +
                    "                  ]}\n" +
                    "              }]}\n" +
                    "        }\n" +
                    "      ]}\n" +
                    "}]}}";
}
