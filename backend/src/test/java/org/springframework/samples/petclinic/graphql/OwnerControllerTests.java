package org.springframework.samples.petclinic.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureHttpGraphQlTester;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.WebGraphQlTester;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureHttpGraphQlTester
public class OwnerControllerTests extends AbstractClinicGraphqlTests {
    @Autowired
    WebGraphQlTester graphQlTester;

    @Test
    void queryAllOwnersWorks() {
        // language=GraphQL
        String document = """
            query {
                owners {
                    owners {
                        id
                        firstName
                    }
                }
                }
            """;

        userRoleGraphQlTester
            .document(document)
            .execute()
            .path("owners.owners[0].id").entity(String.class).isEqualTo("1")
            .path("owners.owners[0].firstName").entity(String.class).isEqualTo("George")
            ;

    }

}
