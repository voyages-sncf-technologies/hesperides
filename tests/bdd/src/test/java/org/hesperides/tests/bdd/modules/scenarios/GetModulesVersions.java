package org.hesperides.tests.bdd.modules.scenarios;

import cucumber.api.java8.En;
import org.hesperides.tests.bdd.commons.HesperidesScenario;
import org.hesperides.tests.bdd.modules.ModuleBuilder;
import org.hesperides.tests.bdd.modules.ModuleClient;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class GetModulesVersions extends HesperidesScenario implements En {

    @Autowired
    private ModuleClient moduleClient;

    public GetModulesVersions() {

        When("^I get the module versions$", () -> {
            testContext.responseEntity = moduleClient.getVersions("new-module");
        });
    }
}