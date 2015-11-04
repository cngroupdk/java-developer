package dk.cngroup.team

import spock.lang.Shared
import spock.lang.Specification

class TestingSpec extends Specification {

    @Shared
    JavaDeveloper javaDeveloper

    void setup() {
        javaDeveloper = new JavaDeveloper()
    }

    void 'JavaDeveloper must use unit testing'() {
        when: 'we ask for unit testing'
        boolean unitTesting = javaDeveloper.unitTesting()

        then: 'answer must be positive'
        unitTesting
    }

    void 'JavaDeveloper must use integration testing'() {
        when: 'we ask for integration testing'
        boolean integrationTesting = javaDeveloper.integrationTesting()

        then: 'answer must be positive'
        integrationTesting
    }

    void 'JavaDeveloper must use end2end testing'() {
        when: 'we ask for end2end testing'
        boolean end2endTesting = javaDeveloper.end2endTesting()

        then: 'answer must be positive'
        end2endTesting
    }

}
